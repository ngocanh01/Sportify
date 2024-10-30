package com.demo.models;
// Generated Nov 6, 2023, 11:24:50 AM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Playlist generated by hbm2java
 */
@Entity
@Table(name = "playlist")
public class Playlist implements java.io.Serializable {

	private Integer id;
	private User user;
	private String name;
	private Set<PlaylistSong> playlistSongs = new HashSet<PlaylistSong>(0);

	public Playlist() {
	}

	public Playlist(User user, String name) {
		this.user = user;
		this.name = name;
	}

	public Playlist(User user, String name, Set<PlaylistSong> playlistSongs) {
		this.user = user;
		this.name = name;
		this.playlistSongs = playlistSongs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "playlist")
	public Set<PlaylistSong> getPlaylistSongs() {
		return this.playlistSongs;
	}

	public void setPlaylistSongs(Set<PlaylistSong> playlistSongs) {
		this.playlistSongs = playlistSongs;
	}

}

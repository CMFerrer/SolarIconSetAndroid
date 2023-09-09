package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.videoaudiosound.Album
import com.chiksmedina.solar.bold.videoaudiosound.Camera
import com.chiksmedina.solar.bold.videoaudiosound.CameraAdd
import com.chiksmedina.solar.bold.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.bold.videoaudiosound.CameraRotate
import com.chiksmedina.solar.bold.videoaudiosound.CameraSquare
import com.chiksmedina.solar.bold.videoaudiosound.Clapperboard
import com.chiksmedina.solar.bold.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.bold.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.bold.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.bold.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.bold.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.bold.videoaudiosound.FullScreen
import com.chiksmedina.solar.bold.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.bold.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.bold.videoaudiosound.Gallery
import com.chiksmedina.solar.bold.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.bold.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.bold.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.bold.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.bold.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.bold.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.bold.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.bold.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.bold.videoaudiosound.GalleryRound
import com.chiksmedina.solar.bold.videoaudiosound.GallerySend
import com.chiksmedina.solar.bold.videoaudiosound.GalleryWide
import com.chiksmedina.solar.bold.videoaudiosound.Library
import com.chiksmedina.solar.bold.videoaudiosound.Microphone
import com.chiksmedina.solar.bold.videoaudiosound.Microphone2
import com.chiksmedina.solar.bold.videoaudiosound.Microphone3
import com.chiksmedina.solar.bold.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.bold.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.bold.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.bold.videoaudiosound.MusicNote
import com.chiksmedina.solar.bold.videoaudiosound.MusicNote2
import com.chiksmedina.solar.bold.videoaudiosound.MusicNote3
import com.chiksmedina.solar.bold.videoaudiosound.MusicNote4
import com.chiksmedina.solar.bold.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.bold.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.bold.videoaudiosound.MusicNotes
import com.chiksmedina.solar.bold.videoaudiosound.Muted
import com.chiksmedina.solar.bold.videoaudiosound.Panorama
import com.chiksmedina.solar.bold.videoaudiosound.Pause
import com.chiksmedina.solar.bold.videoaudiosound.PauseCircle
import com.chiksmedina.solar.bold.videoaudiosound.Pip
import com.chiksmedina.solar.bold.videoaudiosound.Pip2
import com.chiksmedina.solar.bold.videoaudiosound.Play
import com.chiksmedina.solar.bold.videoaudiosound.PlayCircle
import com.chiksmedina.solar.bold.videoaudiosound.PlayStream
import com.chiksmedina.solar.bold.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.bold.videoaudiosound.Podcast
import com.chiksmedina.solar.bold.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.bold.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.bold.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.bold.videoaudiosound.QuitPip
import com.chiksmedina.solar.bold.videoaudiosound.Record
import com.chiksmedina.solar.bold.videoaudiosound.RecordCircle
import com.chiksmedina.solar.bold.videoaudiosound.Reel
import com.chiksmedina.solar.bold.videoaudiosound.Reel2
import com.chiksmedina.solar.bold.videoaudiosound.Repeat
import com.chiksmedina.solar.bold.videoaudiosound.RepeatOne
import com.chiksmedina.solar.bold.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.bold.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.bold.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.bold.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.bold.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.bold.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.bold.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.bold.videoaudiosound.RewindBack
import com.chiksmedina.solar.bold.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.bold.videoaudiosound.RewindForward
import com.chiksmedina.solar.bold.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.bold.videoaudiosound.Shuffle
import com.chiksmedina.solar.bold.videoaudiosound.SkipNext
import com.chiksmedina.solar.bold.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.bold.videoaudiosound.Soundwave
import com.chiksmedina.solar.bold.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.bold.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.bold.videoaudiosound.Stop
import com.chiksmedina.solar.bold.videoaudiosound.StopCircle
import com.chiksmedina.solar.bold.videoaudiosound.Stream
import com.chiksmedina.solar.bold.videoaudiosound.ToPip
import com.chiksmedina.solar.bold.videoaudiosound.UploadTrack
import com.chiksmedina.solar.bold.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.bold.videoaudiosound.VideoFrame
import com.chiksmedina.solar.bold.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.bold.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.bold.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.bold.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.bold.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.bold.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.bold.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.bold.videoaudiosound.Videocamera
import com.chiksmedina.solar.bold.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.bold.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.bold.videoaudiosound.Vinyl
import com.chiksmedina.solar.bold.videoaudiosound.VinylRecord
import com.chiksmedina.solar.bold.videoaudiosound.Volume
import com.chiksmedina.solar.bold.videoaudiosound.VolumeCross
import com.chiksmedina.solar.bold.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.bold.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.bold.videoaudiosound.Wallpaper
import kotlin.collections.List as ____KtList

public object VideoAudioSoundGroup

public val BoldGroup.VideoAudioSound: VideoAudioSoundGroup
  get() = VideoAudioSoundGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VideoAudioSoundGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Album, Camera, CameraAdd, CameraMinimalistic, CameraRotate, CameraSquare,
        Clapperboard, ClapperboardEdit, ClapperboardOpen, ClapperboardOpenPlay, ClapperboardPlay,
        ClapperboardText, FullScreen, FullScreenCircle, FullScreenSquare, Gallery, GalleryAdd,
        GalleryCheck, GalleryCircle, GalleryDownload, GalleryEdit, GalleryFavourite,
        GalleryMinimalistic, GalleryRemove, GalleryRound, GallerySend, GalleryWide, Library,
        Microphone, Microphone2, Microphone3, MicrophoneLarge, MusicLibrary, MusicLibrary2,
        MusicNote, MusicNotes, MusicNote2, MusicNote3, MusicNote4, MusicNoteSlider,
        MusicNoteSlider2, Muted, Panorama, Pause, PauseCircle, Pip, Pip2, Play, PlaybackSpeed,
        PlayCircle, PlayStream, Podcast, QuitFullScreen, QuitFullScreenCircle, QuitFullScreenSquare,
        QuitPip, Record, RecordCircle, Reel, Reel2, Repeat, RepeatOne, RepeatOneMinimalistic,
        Rewind10SecondsBack, Rewind10SecondsForward, Rewind15SecondsBack, Rewind15SecondsForward,
        Rewind5SecondsBack, Rewind5SecondsForward, RewindBack, RewindBackCircle, RewindForward,
        RewindForwardCircle, Shuffle, SkipNext, SkipPrevious, Soundwave, SoundwaveCircle,
        SoundwaveSquare, Stop, StopCircle, Stream, ToPip, UploadTrack, UploadTrack2, Videocamera,
        VideocameraAdd, VideocameraRecord, VideoFrame, VideoFrame2, VideoFrameCut, VideoFrameCut2,
        VideoFramePlayHorizontal, VideoFramePlayVertical, VideoFrameReplace, VideoLibrary, Vinyl,
        VinylRecord, Volume, VolumeCross, VolumeLoud, VolumeSmall, Wallpaper)
    return __AllIcons!!
  }

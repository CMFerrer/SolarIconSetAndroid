package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.videoaudiosound.Album
import com.chiksmedina.solar.linear.videoaudiosound.Camera
import com.chiksmedina.solar.linear.videoaudiosound.CameraAdd
import com.chiksmedina.solar.linear.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.linear.videoaudiosound.CameraRotate
import com.chiksmedina.solar.linear.videoaudiosound.CameraSquare
import com.chiksmedina.solar.linear.videoaudiosound.Clapperboard
import com.chiksmedina.solar.linear.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.linear.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.linear.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.linear.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.linear.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.linear.videoaudiosound.FullScreen
import com.chiksmedina.solar.linear.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.linear.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.linear.videoaudiosound.Gallery
import com.chiksmedina.solar.linear.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.linear.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.linear.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.linear.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.linear.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.linear.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.linear.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.linear.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.linear.videoaudiosound.GalleryRound
import com.chiksmedina.solar.linear.videoaudiosound.GallerySend
import com.chiksmedina.solar.linear.videoaudiosound.GalleryWide
import com.chiksmedina.solar.linear.videoaudiosound.Library
import com.chiksmedina.solar.linear.videoaudiosound.Microphone
import com.chiksmedina.solar.linear.videoaudiosound.Microphone2
import com.chiksmedina.solar.linear.videoaudiosound.Microphone3
import com.chiksmedina.solar.linear.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.linear.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.linear.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.linear.videoaudiosound.MusicNote
import com.chiksmedina.solar.linear.videoaudiosound.MusicNote2
import com.chiksmedina.solar.linear.videoaudiosound.MusicNote3
import com.chiksmedina.solar.linear.videoaudiosound.MusicNote4
import com.chiksmedina.solar.linear.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.linear.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.linear.videoaudiosound.MusicNotes
import com.chiksmedina.solar.linear.videoaudiosound.Muted
import com.chiksmedina.solar.linear.videoaudiosound.Panorama
import com.chiksmedina.solar.linear.videoaudiosound.Pause
import com.chiksmedina.solar.linear.videoaudiosound.PauseCircle
import com.chiksmedina.solar.linear.videoaudiosound.Pip
import com.chiksmedina.solar.linear.videoaudiosound.Pip2
import com.chiksmedina.solar.linear.videoaudiosound.Play
import com.chiksmedina.solar.linear.videoaudiosound.PlayCircle
import com.chiksmedina.solar.linear.videoaudiosound.PlayStream
import com.chiksmedina.solar.linear.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.linear.videoaudiosound.Podcast
import com.chiksmedina.solar.linear.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.linear.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.linear.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.linear.videoaudiosound.QuitPip
import com.chiksmedina.solar.linear.videoaudiosound.Record
import com.chiksmedina.solar.linear.videoaudiosound.RecordCircle
import com.chiksmedina.solar.linear.videoaudiosound.Reel
import com.chiksmedina.solar.linear.videoaudiosound.Reel2
import com.chiksmedina.solar.linear.videoaudiosound.Repeat
import com.chiksmedina.solar.linear.videoaudiosound.RepeatOne
import com.chiksmedina.solar.linear.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.linear.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.linear.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.linear.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.linear.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.linear.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.linear.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.linear.videoaudiosound.RewindBack
import com.chiksmedina.solar.linear.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.linear.videoaudiosound.RewindForward
import com.chiksmedina.solar.linear.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.linear.videoaudiosound.Shuffle
import com.chiksmedina.solar.linear.videoaudiosound.SkipNext
import com.chiksmedina.solar.linear.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.linear.videoaudiosound.Soundwave
import com.chiksmedina.solar.linear.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.linear.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.linear.videoaudiosound.Stop
import com.chiksmedina.solar.linear.videoaudiosound.StopCircle
import com.chiksmedina.solar.linear.videoaudiosound.Stream
import com.chiksmedina.solar.linear.videoaudiosound.ToPip
import com.chiksmedina.solar.linear.videoaudiosound.UploadTrack
import com.chiksmedina.solar.linear.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.linear.videoaudiosound.VideoFrame
import com.chiksmedina.solar.linear.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.linear.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.linear.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.linear.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.linear.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.linear.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.linear.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.linear.videoaudiosound.Videocamera
import com.chiksmedina.solar.linear.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.linear.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.linear.videoaudiosound.Vinyl
import com.chiksmedina.solar.linear.videoaudiosound.VinylRecord
import com.chiksmedina.solar.linear.videoaudiosound.Volume
import com.chiksmedina.solar.linear.videoaudiosound.VolumeCross
import com.chiksmedina.solar.linear.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.linear.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.linear.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val LinearSolar.VideoAudioSound: VideoAudioSoundGroup
    get() = VideoAudioSoundGroup

private var _AllIcons: KtList<ImageVector>? = null

val VideoAudioSoundGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Album,
            Camera,
            CameraAdd,
            CameraMinimalistic,
            CameraRotate,
            CameraSquare,
            Clapperboard,
            ClapperboardEdit,
            ClapperboardOpen,
            ClapperboardOpenPlay,
            ClapperboardPlay,
            ClapperboardText,
            FullScreen,
            FullScreenCircle,
            FullScreenSquare,
            Gallery,
            GalleryAdd,
            GalleryCheck,
            GalleryCircle,
            GalleryDownload,
            GalleryEdit,
            GalleryFavourite,
            GalleryMinimalistic,
            GalleryRemove,
            GalleryRound,
            GallerySend,
            GalleryWide,
            Library,
            Microphone,
            Microphone2,
            Microphone3,
            MicrophoneLarge,
            MusicLibrary,
            MusicLibrary2,
            MusicNote,
            MusicNotes,
            MusicNote2,
            MusicNote3,
            MusicNote4,
            MusicNoteSlider,
            MusicNoteSlider2,
            Muted,
            Panorama,
            Pause,
            PauseCircle,
            Pip,
            Pip2,
            Play,
            PlaybackSpeed,
            PlayCircle,
            PlayStream,
            Podcast,
            QuitFullScreen,
            QuitFullScreenCircle,
            QuitFullScreenSquare,
            QuitPip,
            Record,
            RecordCircle,
            Reel,
            Reel2,
            Repeat,
            RepeatOne,
            RepeatOneMinimalistic,
            Rewind10SecondsBack,
            Rewind10SecondsForward,
            Rewind15SecondsBack,
            Rewind15SecondsForward,
            Rewind5SecondsBack,
            Rewind5SecondsForward,
            RewindBack,
            RewindBackCircle,
            RewindForward,
            RewindForwardCircle,
            Shuffle,
            SkipNext,
            SkipPrevious,
            Soundwave,
            SoundwaveCircle,
            SoundwaveSquare,
            Stop,
            StopCircle,
            Stream,
            ToPip,
            UploadTrack,
            UploadTrack2,
            Videocamera,
            VideocameraAdd,
            VideocameraRecord,
            VideoFrame,
            VideoFrame2,
            VideoFrameCut,
            VideoFrameCut2,
            VideoFramePlayHorizontal,
            VideoFramePlayVertical,
            VideoFrameReplace,
            VideoLibrary,
            Vinyl,
            VinylRecord,
            Volume,
            VolumeCross,
            VolumeLoud,
            VolumeSmall,
            Wallpaper
        )
        return _AllIcons!!
    }

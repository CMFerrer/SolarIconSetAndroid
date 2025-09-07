package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.videoaudiosound.Album
import com.chiksmedina.solar.broken.videoaudiosound.Camera
import com.chiksmedina.solar.broken.videoaudiosound.CameraAdd
import com.chiksmedina.solar.broken.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.broken.videoaudiosound.CameraRotate
import com.chiksmedina.solar.broken.videoaudiosound.CameraSquare
import com.chiksmedina.solar.broken.videoaudiosound.Clapperboard
import com.chiksmedina.solar.broken.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.broken.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.broken.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.broken.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.broken.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.broken.videoaudiosound.FullScreen
import com.chiksmedina.solar.broken.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.broken.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.broken.videoaudiosound.Gallery
import com.chiksmedina.solar.broken.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.broken.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.broken.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.broken.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.broken.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.broken.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.broken.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.broken.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.broken.videoaudiosound.GalleryRound
import com.chiksmedina.solar.broken.videoaudiosound.GallerySend
import com.chiksmedina.solar.broken.videoaudiosound.GalleryWide
import com.chiksmedina.solar.broken.videoaudiosound.Library
import com.chiksmedina.solar.broken.videoaudiosound.Microphone
import com.chiksmedina.solar.broken.videoaudiosound.Microphone2
import com.chiksmedina.solar.broken.videoaudiosound.Microphone3
import com.chiksmedina.solar.broken.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.broken.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.broken.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.broken.videoaudiosound.MusicNote
import com.chiksmedina.solar.broken.videoaudiosound.MusicNote2
import com.chiksmedina.solar.broken.videoaudiosound.MusicNote3
import com.chiksmedina.solar.broken.videoaudiosound.MusicNote4
import com.chiksmedina.solar.broken.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.broken.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.broken.videoaudiosound.MusicNotes
import com.chiksmedina.solar.broken.videoaudiosound.Muted
import com.chiksmedina.solar.broken.videoaudiosound.Panorama
import com.chiksmedina.solar.broken.videoaudiosound.Pause
import com.chiksmedina.solar.broken.videoaudiosound.PauseCircle
import com.chiksmedina.solar.broken.videoaudiosound.Pip
import com.chiksmedina.solar.broken.videoaudiosound.Pip2
import com.chiksmedina.solar.broken.videoaudiosound.Play
import com.chiksmedina.solar.broken.videoaudiosound.PlayCircle
import com.chiksmedina.solar.broken.videoaudiosound.PlayStream
import com.chiksmedina.solar.broken.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.broken.videoaudiosound.Podcast
import com.chiksmedina.solar.broken.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.broken.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.broken.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.broken.videoaudiosound.QuitPip
import com.chiksmedina.solar.broken.videoaudiosound.Record
import com.chiksmedina.solar.broken.videoaudiosound.RecordCircle
import com.chiksmedina.solar.broken.videoaudiosound.Reel
import com.chiksmedina.solar.broken.videoaudiosound.Reel2
import com.chiksmedina.solar.broken.videoaudiosound.Repeat
import com.chiksmedina.solar.broken.videoaudiosound.RepeatOne
import com.chiksmedina.solar.broken.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.broken.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.broken.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.broken.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.broken.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.broken.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.broken.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.broken.videoaudiosound.RewindBack
import com.chiksmedina.solar.broken.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.broken.videoaudiosound.RewindForward
import com.chiksmedina.solar.broken.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.broken.videoaudiosound.Shuffle
import com.chiksmedina.solar.broken.videoaudiosound.SkipNext
import com.chiksmedina.solar.broken.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.broken.videoaudiosound.Soundwave
import com.chiksmedina.solar.broken.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.broken.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.broken.videoaudiosound.Stop
import com.chiksmedina.solar.broken.videoaudiosound.StopCircle
import com.chiksmedina.solar.broken.videoaudiosound.Stream
import com.chiksmedina.solar.broken.videoaudiosound.ToPip
import com.chiksmedina.solar.broken.videoaudiosound.UploadTrack
import com.chiksmedina.solar.broken.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.broken.videoaudiosound.VideoFrame
import com.chiksmedina.solar.broken.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.broken.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.broken.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.broken.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.broken.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.broken.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.broken.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.broken.videoaudiosound.Videocamera
import com.chiksmedina.solar.broken.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.broken.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.broken.videoaudiosound.Vinyl
import com.chiksmedina.solar.broken.videoaudiosound.VinylRecord
import com.chiksmedina.solar.broken.videoaudiosound.Volume
import com.chiksmedina.solar.broken.videoaudiosound.VolumeCross
import com.chiksmedina.solar.broken.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.broken.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.broken.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val BrokenSolar.VideoAudioSound: VideoAudioSoundGroup
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

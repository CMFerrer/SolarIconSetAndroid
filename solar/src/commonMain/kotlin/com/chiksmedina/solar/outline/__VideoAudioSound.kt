package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.videoaudiosound.Album
import com.chiksmedina.solar.outline.videoaudiosound.Camera
import com.chiksmedina.solar.outline.videoaudiosound.CameraAdd
import com.chiksmedina.solar.outline.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.outline.videoaudiosound.CameraRotate
import com.chiksmedina.solar.outline.videoaudiosound.CameraSquare
import com.chiksmedina.solar.outline.videoaudiosound.Clapperboard
import com.chiksmedina.solar.outline.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.outline.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.outline.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.outline.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.outline.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.outline.videoaudiosound.FullScreen
import com.chiksmedina.solar.outline.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.outline.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.outline.videoaudiosound.Gallery
import com.chiksmedina.solar.outline.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.outline.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.outline.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.outline.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.outline.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.outline.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.outline.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.outline.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.outline.videoaudiosound.GalleryRound
import com.chiksmedina.solar.outline.videoaudiosound.GallerySend
import com.chiksmedina.solar.outline.videoaudiosound.GalleryWide
import com.chiksmedina.solar.outline.videoaudiosound.Library
import com.chiksmedina.solar.outline.videoaudiosound.Microphone
import com.chiksmedina.solar.outline.videoaudiosound.Microphone2
import com.chiksmedina.solar.outline.videoaudiosound.Microphone3
import com.chiksmedina.solar.outline.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.outline.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.outline.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.outline.videoaudiosound.MusicNote
import com.chiksmedina.solar.outline.videoaudiosound.MusicNote2
import com.chiksmedina.solar.outline.videoaudiosound.MusicNote3
import com.chiksmedina.solar.outline.videoaudiosound.MusicNote4
import com.chiksmedina.solar.outline.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.outline.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.outline.videoaudiosound.MusicNotes
import com.chiksmedina.solar.outline.videoaudiosound.Muted
import com.chiksmedina.solar.outline.videoaudiosound.Panorama
import com.chiksmedina.solar.outline.videoaudiosound.Pause
import com.chiksmedina.solar.outline.videoaudiosound.PauseCircle
import com.chiksmedina.solar.outline.videoaudiosound.Pip
import com.chiksmedina.solar.outline.videoaudiosound.Pip2
import com.chiksmedina.solar.outline.videoaudiosound.Play
import com.chiksmedina.solar.outline.videoaudiosound.PlayCircle
import com.chiksmedina.solar.outline.videoaudiosound.PlayStream
import com.chiksmedina.solar.outline.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.outline.videoaudiosound.Podcast
import com.chiksmedina.solar.outline.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.outline.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.outline.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.outline.videoaudiosound.QuitPip
import com.chiksmedina.solar.outline.videoaudiosound.Record
import com.chiksmedina.solar.outline.videoaudiosound.RecordCircle
import com.chiksmedina.solar.outline.videoaudiosound.Reel
import com.chiksmedina.solar.outline.videoaudiosound.Reel2
import com.chiksmedina.solar.outline.videoaudiosound.Repeat
import com.chiksmedina.solar.outline.videoaudiosound.RepeatOne
import com.chiksmedina.solar.outline.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.outline.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.outline.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.outline.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.outline.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.outline.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.outline.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.outline.videoaudiosound.RewindBack
import com.chiksmedina.solar.outline.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.outline.videoaudiosound.RewindForward
import com.chiksmedina.solar.outline.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.outline.videoaudiosound.Shuffle
import com.chiksmedina.solar.outline.videoaudiosound.SkipNext
import com.chiksmedina.solar.outline.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.outline.videoaudiosound.Soundwave
import com.chiksmedina.solar.outline.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.outline.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.outline.videoaudiosound.Stop
import com.chiksmedina.solar.outline.videoaudiosound.StopCircle
import com.chiksmedina.solar.outline.videoaudiosound.Stream
import com.chiksmedina.solar.outline.videoaudiosound.ToPip
import com.chiksmedina.solar.outline.videoaudiosound.UploadTrack
import com.chiksmedina.solar.outline.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.outline.videoaudiosound.VideoFrame
import com.chiksmedina.solar.outline.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.outline.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.outline.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.outline.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.outline.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.outline.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.outline.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.outline.videoaudiosound.Videocamera
import com.chiksmedina.solar.outline.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.outline.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.outline.videoaudiosound.Vinyl
import com.chiksmedina.solar.outline.videoaudiosound.VinylRecord
import com.chiksmedina.solar.outline.videoaudiosound.Volume
import com.chiksmedina.solar.outline.videoaudiosound.VolumeCross
import com.chiksmedina.solar.outline.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.outline.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.outline.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val OutlineSolar.VideoAudioSound: VideoAudioSoundGroup
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

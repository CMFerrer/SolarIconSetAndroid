package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.videoaudiosound.Album
import com.chiksmedina.solar.lineduotone.videoaudiosound.Camera
import com.chiksmedina.solar.lineduotone.videoaudiosound.CameraAdd
import com.chiksmedina.solar.lineduotone.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.lineduotone.videoaudiosound.CameraRotate
import com.chiksmedina.solar.lineduotone.videoaudiosound.CameraSquare
import com.chiksmedina.solar.lineduotone.videoaudiosound.Clapperboard
import com.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.lineduotone.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.lineduotone.videoaudiosound.FullScreen
import com.chiksmedina.solar.lineduotone.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.lineduotone.videoaudiosound.Gallery
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryRound
import com.chiksmedina.solar.lineduotone.videoaudiosound.GallerySend
import com.chiksmedina.solar.lineduotone.videoaudiosound.GalleryWide
import com.chiksmedina.solar.lineduotone.videoaudiosound.Library
import com.chiksmedina.solar.lineduotone.videoaudiosound.Microphone
import com.chiksmedina.solar.lineduotone.videoaudiosound.Microphone2
import com.chiksmedina.solar.lineduotone.videoaudiosound.Microphone3
import com.chiksmedina.solar.lineduotone.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote2
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote3
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNote4
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.lineduotone.videoaudiosound.MusicNotes
import com.chiksmedina.solar.lineduotone.videoaudiosound.Muted
import com.chiksmedina.solar.lineduotone.videoaudiosound.Panorama
import com.chiksmedina.solar.lineduotone.videoaudiosound.Pause
import com.chiksmedina.solar.lineduotone.videoaudiosound.PauseCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.Pip
import com.chiksmedina.solar.lineduotone.videoaudiosound.Pip2
import com.chiksmedina.solar.lineduotone.videoaudiosound.Play
import com.chiksmedina.solar.lineduotone.videoaudiosound.PlayCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.PlayStream
import com.chiksmedina.solar.lineduotone.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.lineduotone.videoaudiosound.Podcast
import com.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.lineduotone.videoaudiosound.QuitPip
import com.chiksmedina.solar.lineduotone.videoaudiosound.Record
import com.chiksmedina.solar.lineduotone.videoaudiosound.RecordCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.Reel
import com.chiksmedina.solar.lineduotone.videoaudiosound.Reel2
import com.chiksmedina.solar.lineduotone.videoaudiosound.Repeat
import com.chiksmedina.solar.lineduotone.videoaudiosound.RepeatOne
import com.chiksmedina.solar.lineduotone.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.lineduotone.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.lineduotone.videoaudiosound.RewindBack
import com.chiksmedina.solar.lineduotone.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.RewindForward
import com.chiksmedina.solar.lineduotone.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.Shuffle
import com.chiksmedina.solar.lineduotone.videoaudiosound.SkipNext
import com.chiksmedina.solar.lineduotone.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.lineduotone.videoaudiosound.Soundwave
import com.chiksmedina.solar.lineduotone.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.lineduotone.videoaudiosound.Stop
import com.chiksmedina.solar.lineduotone.videoaudiosound.StopCircle
import com.chiksmedina.solar.lineduotone.videoaudiosound.Stream
import com.chiksmedina.solar.lineduotone.videoaudiosound.ToPip
import com.chiksmedina.solar.lineduotone.videoaudiosound.UploadTrack
import com.chiksmedina.solar.lineduotone.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrame
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.lineduotone.videoaudiosound.Videocamera
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.lineduotone.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.lineduotone.videoaudiosound.Vinyl
import com.chiksmedina.solar.lineduotone.videoaudiosound.VinylRecord
import com.chiksmedina.solar.lineduotone.videoaudiosound.Volume
import com.chiksmedina.solar.lineduotone.videoaudiosound.VolumeCross
import com.chiksmedina.solar.lineduotone.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.lineduotone.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.lineduotone.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val LineDuotoneSolar.VideoAudioSound: VideoAudioSoundGroup
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

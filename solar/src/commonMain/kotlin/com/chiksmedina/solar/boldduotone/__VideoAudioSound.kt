package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.videoaudiosound.Album
import com.chiksmedina.solar.boldduotone.videoaudiosound.Camera
import com.chiksmedina.solar.boldduotone.videoaudiosound.CameraAdd
import com.chiksmedina.solar.boldduotone.videoaudiosound.CameraMinimalistic
import com.chiksmedina.solar.boldduotone.videoaudiosound.CameraRotate
import com.chiksmedina.solar.boldduotone.videoaudiosound.CameraSquare
import com.chiksmedina.solar.boldduotone.videoaudiosound.Clapperboard
import com.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardEdit
import com.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardOpen
import com.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardOpenPlay
import com.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardPlay
import com.chiksmedina.solar.boldduotone.videoaudiosound.ClapperboardText
import com.chiksmedina.solar.boldduotone.videoaudiosound.FullScreen
import com.chiksmedina.solar.boldduotone.videoaudiosound.FullScreenCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.FullScreenSquare
import com.chiksmedina.solar.boldduotone.videoaudiosound.Gallery
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryAdd
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryCheck
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryDownload
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryEdit
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryFavourite
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryMinimalistic
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryRemove
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryRound
import com.chiksmedina.solar.boldduotone.videoaudiosound.GallerySend
import com.chiksmedina.solar.boldduotone.videoaudiosound.GalleryWide
import com.chiksmedina.solar.boldduotone.videoaudiosound.Library
import com.chiksmedina.solar.boldduotone.videoaudiosound.Microphone
import com.chiksmedina.solar.boldduotone.videoaudiosound.Microphone2
import com.chiksmedina.solar.boldduotone.videoaudiosound.Microphone3
import com.chiksmedina.solar.boldduotone.videoaudiosound.MicrophoneLarge
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicLibrary
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicLibrary2
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote2
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote3
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNote4
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNoteSlider
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNoteSlider2
import com.chiksmedina.solar.boldduotone.videoaudiosound.MusicNotes
import com.chiksmedina.solar.boldduotone.videoaudiosound.Muted
import com.chiksmedina.solar.boldduotone.videoaudiosound.Panorama
import com.chiksmedina.solar.boldduotone.videoaudiosound.Pause
import com.chiksmedina.solar.boldduotone.videoaudiosound.PauseCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.Pip
import com.chiksmedina.solar.boldduotone.videoaudiosound.Pip2
import com.chiksmedina.solar.boldduotone.videoaudiosound.Play
import com.chiksmedina.solar.boldduotone.videoaudiosound.PlayCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.PlayStream
import com.chiksmedina.solar.boldduotone.videoaudiosound.PlaybackSpeed
import com.chiksmedina.solar.boldduotone.videoaudiosound.Podcast
import com.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreen
import com.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreenCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.QuitFullScreenSquare
import com.chiksmedina.solar.boldduotone.videoaudiosound.QuitPip
import com.chiksmedina.solar.boldduotone.videoaudiosound.Record
import com.chiksmedina.solar.boldduotone.videoaudiosound.RecordCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.Reel
import com.chiksmedina.solar.boldduotone.videoaudiosound.Reel2
import com.chiksmedina.solar.boldduotone.videoaudiosound.Repeat
import com.chiksmedina.solar.boldduotone.videoaudiosound.RepeatOne
import com.chiksmedina.solar.boldduotone.videoaudiosound.RepeatOneMinimalistic
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind10SecondsBack
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind10SecondsForward
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind15SecondsBack
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind15SecondsForward
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind5SecondsBack
import com.chiksmedina.solar.boldduotone.videoaudiosound.Rewind5SecondsForward
import com.chiksmedina.solar.boldduotone.videoaudiosound.RewindBack
import com.chiksmedina.solar.boldduotone.videoaudiosound.RewindBackCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.RewindForward
import com.chiksmedina.solar.boldduotone.videoaudiosound.RewindForwardCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.Shuffle
import com.chiksmedina.solar.boldduotone.videoaudiosound.SkipNext
import com.chiksmedina.solar.boldduotone.videoaudiosound.SkipPrevious
import com.chiksmedina.solar.boldduotone.videoaudiosound.Soundwave
import com.chiksmedina.solar.boldduotone.videoaudiosound.SoundwaveCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.SoundwaveSquare
import com.chiksmedina.solar.boldduotone.videoaudiosound.Stop
import com.chiksmedina.solar.boldduotone.videoaudiosound.StopCircle
import com.chiksmedina.solar.boldduotone.videoaudiosound.Stream
import com.chiksmedina.solar.boldduotone.videoaudiosound.ToPip
import com.chiksmedina.solar.boldduotone.videoaudiosound.UploadTrack
import com.chiksmedina.solar.boldduotone.videoaudiosound.UploadTrack2
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrame
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrame2
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameCut
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameCut2
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFramePlayHorizontal
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFramePlayVertical
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoFrameReplace
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideoLibrary
import com.chiksmedina.solar.boldduotone.videoaudiosound.Videocamera
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideocameraAdd
import com.chiksmedina.solar.boldduotone.videoaudiosound.VideocameraRecord
import com.chiksmedina.solar.boldduotone.videoaudiosound.Vinyl
import com.chiksmedina.solar.boldduotone.videoaudiosound.VinylRecord
import com.chiksmedina.solar.boldduotone.videoaudiosound.Volume
import com.chiksmedina.solar.boldduotone.videoaudiosound.VolumeCross
import com.chiksmedina.solar.boldduotone.videoaudiosound.VolumeLoud
import com.chiksmedina.solar.boldduotone.videoaudiosound.VolumeSmall
import com.chiksmedina.solar.boldduotone.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val BoldDuotoneSolar.VideoAudioSound: VideoAudioSoundGroup
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

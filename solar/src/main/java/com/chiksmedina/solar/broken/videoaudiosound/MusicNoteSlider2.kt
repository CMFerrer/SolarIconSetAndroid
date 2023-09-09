package com.chiksmedina.solar.broken.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.VideoAudioSoundGroup

public val VideoAudioSoundGroup.MusicNoteSlider2: ImageVector
    get() {
        if (_musicNoteSlider2 != null) {
            return _musicNoteSlider2!!
        }
        _musicNoteSlider2 = Builder(name = "MusicNoteSlider2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 19.5f)
                curveTo(19.4645f, 19.5f, 19.6968f, 19.5f, 19.8911f, 19.4692f)
                curveTo(20.9608f, 19.2998f, 21.7998f, 18.4608f, 21.9692f, 17.3911f)
                curveTo(22.0f, 17.1968f, 22.0f, 16.9645f, 22.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 7.0355f, 22.0f, 6.8032f, 21.9692f, 6.6089f)
                curveTo(21.7998f, 5.5392f, 20.9608f, 4.7002f, 19.8911f, 4.5308f)
                curveTo(19.6968f, 4.5f, 19.4645f, 4.5f, 19.0f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.5f)
                curveTo(4.5355f, 19.5f, 4.3032f, 19.5f, 4.1089f, 19.4692f)
                curveTo(3.0392f, 19.2998f, 2.2002f, 18.4608f, 2.0308f, 17.3911f)
                curveTo(2.0f, 17.1968f, 2.0f, 16.9645f, 2.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 7.0355f, 2.0f, 6.8032f, 2.0308f, 6.6089f)
                curveTo(2.2002f, 5.5392f, 3.0392f, 4.7002f, 4.1089f, 4.5308f)
                curveTo(4.3032f, 4.5f, 4.5355f, 4.5f, 5.0f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(12.0f, 16.1046f, 11.1046f, 17.0f, 10.0f, 17.0f)
                curveTo(8.8954f, 17.0f, 8.0f, 16.1046f, 8.0f, 15.0f)
                curveTo(8.0f, 13.8954f, 8.8954f, 13.0f, 10.0f, 13.0f)
                curveTo(11.1046f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 15.0f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0584f, 7.971f)
                lineTo(12.7416f, 8.6294f)
                curveTo(12.5592f, 8.7206f, 12.468f, 8.7662f, 12.3926f, 8.8238f)
                curveTo(12.1974f, 8.973f, 12.064f, 9.1889f, 12.0178f, 9.4302f)
                curveTo(12.0f, 9.5234f, 12.0f, 9.6254f, 12.0f, 9.8294f)
                curveTo(12.0f, 10.3149f, 12.0f, 10.5577f, 12.0598f, 10.7227f)
                curveTo(12.2178f, 11.1589f, 12.6551f, 11.4292f, 13.1159f, 11.3754f)
                curveTo(13.2902f, 11.3551f, 13.5074f, 11.2465f, 13.9416f, 11.0294f)
                lineTo(15.2584f, 10.371f)
                curveTo(15.4408f, 10.2798f, 15.532f, 10.2342f, 15.6074f, 10.1765f)
                curveTo(15.8026f, 10.0273f, 15.936f, 9.8115f, 15.9822f, 9.5701f)
                curveTo(16.0f, 9.477f, 16.0f, 9.375f, 16.0f, 9.171f)
                curveTo(16.0f, 8.6854f, 16.0f, 8.4427f, 15.9402f, 8.2776f)
                curveTo(15.7822f, 7.8414f, 15.3449f, 7.5712f, 14.8841f, 7.6249f)
                curveTo(14.7098f, 7.6453f, 14.4926f, 7.7538f, 14.0584f, 7.971f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9983f, 17.0f)
                curveTo(18.9862f, 19.175f, 18.8897f, 20.3529f, 18.1213f, 21.1213f)
                curveTo(17.2426f, 22.0f, 15.8284f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(8.1716f, 22.0f, 6.7574f, 22.0f, 5.8787f, 21.1213f)
                curveTo(5.0f, 20.2426f, 5.0f, 18.8284f, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 5.1716f, 5.0f, 3.7574f, 5.8787f, 2.8787f)
                curveTo(6.7574f, 2.0f, 8.1716f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 2.0f, 17.2426f, 2.0f, 18.1213f, 2.8787f)
                curveTo(19.0f, 3.7574f, 19.0f, 5.1716f, 19.0f, 8.0f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _musicNoteSlider2!!
    }

private var _musicNoteSlider2: ImageVector? = null

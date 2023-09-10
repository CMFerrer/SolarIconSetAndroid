package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.RewindForwardCircle: ImageVector
    get() {
        if (_rewindForwardCircle != null) {
            return _rewindForwardCircle!!
        }
        _rewindForwardCircle = Builder(
            name = "RewindForwardCircle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 8.0714f)
                lineTo(16.2215f, 10.3725f)
                curveTo(17.3382f, 11.1702f, 17.3382f, 12.8298f, 16.2215f, 13.6274f)
                lineTo(13.0f, 15.9286f)
                moveTo(7.5f, 15.0568f)
                verticalLineTo(8.9432f)
                curveTo(7.5f, 8.1298f, 8.4194f, 7.6567f, 9.0812f, 8.1294f)
                lineTo(13.3608f, 11.1862f)
                curveTo(13.9191f, 11.5851f, 13.9191f, 12.4149f, 13.3608f, 12.8137f)
                lineTo(9.0812f, 15.8705f)
                curveTo(8.4194f, 16.3433f, 7.5f, 15.8702f, 7.5f, 15.0568f)
                close()
            }
        }
            .build()
        return _rewindForwardCircle!!
    }

private var _rewindForwardCircle: ImageVector? = null

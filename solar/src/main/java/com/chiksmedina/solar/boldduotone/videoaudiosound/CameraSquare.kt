package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.CameraSquare: ImageVector
    get() {
        if (_cameraSquare != null) {
            return _cameraSquare!!
        }
        _cameraSquare = Builder(
            name = "CameraSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 7.25f)
                curveTo(9.3766f, 7.25f, 7.25f, 9.3766f, 7.25f, 12.0f)
                curveTo(7.25f, 14.6234f, 9.3766f, 16.75f, 12.0f, 16.75f)
                curveTo(14.6234f, 16.75f, 16.75f, 14.6234f, 16.75f, 12.0f)
                curveTo(16.75f, 9.3766f, 14.6234f, 7.25f, 12.0f, 7.25f)
                close()
                moveTo(12.0f, 8.75f)
                curveTo(10.2051f, 8.75f, 8.75f, 10.2051f, 8.75f, 12.0f)
                curveTo(8.75f, 13.7949f, 10.2051f, 15.25f, 12.0f, 15.25f)
                curveTo(13.7949f, 15.25f, 15.25f, 13.7949f, 15.25f, 12.0f)
                curveTo(15.25f, 10.2051f, 13.7949f, 8.75f, 12.0f, 8.75f)
                close()
            }
        }
            .build()
        return _cameraSquare!!
    }

private var _cameraSquare: ImageVector? = null

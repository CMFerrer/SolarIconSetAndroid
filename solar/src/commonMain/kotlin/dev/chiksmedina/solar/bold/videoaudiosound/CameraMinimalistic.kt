package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.CameraMinimalistic: ImageVector
    get() {
        if (_cameraMinimalistic != null) {
            return _cameraMinimalistic!!
        }
        _cameraMinimalistic = Builder(
            name = "CameraMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 3.4477f, 8.4133f, 3.0f, 8.9231f, 3.0f)
                horizontalLineTo(15.0769f)
                curveTo(15.5867f, 3.0f, 16.0f, 3.4477f, 16.0f, 4.0f)
                curveTo(16.0f, 4.5523f, 15.5867f, 5.0f, 15.0769f, 5.0f)
                horizontalLineTo(8.9231f)
                curveTo(8.4133f, 5.0f, 8.0f, 4.5523f, 8.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.7778f, 21.0f)
                horizontalLineTo(14.2222f)
                curveTo(17.3433f, 21.0f, 18.9038f, 21.0f, 20.0248f, 20.2777f)
                curveTo(20.51f, 19.965f, 20.9267f, 19.5632f, 21.251f, 19.0953f)
                curveTo(22.0f, 18.0143f, 22.0f, 16.5095f, 22.0f, 13.4999f)
                curveTo(22.0f, 10.4903f, 21.9998f, 8.9857f, 21.2508f, 7.9047f)
                curveTo(20.9266f, 7.4368f, 20.5099f, 7.035f, 20.0246f, 6.7223f)
                curveTo(18.9036f, 6.0f, 17.3431f, 6.0f, 14.2221f, 6.0f)
                horizontalLineTo(9.7776f)
                curveTo(6.6566f, 6.0f, 5.0961f, 6.0f, 3.9751f, 6.7223f)
                curveTo(3.4898f, 7.035f, 3.0731f, 7.4368f, 2.7489f, 7.9047f)
                curveTo(2.0f, 8.9855f, 2.0f, 10.4896f, 2.0f, 13.4979f)
                lineTo(2.0f, 13.4999f)
                curveTo(2.0f, 16.5095f, 2.0f, 18.0143f, 2.749f, 19.0953f)
                curveTo(3.0733f, 19.5632f, 3.4899f, 19.965f, 3.9752f, 20.2777f)
                curveTo(5.0962f, 21.0f, 6.6568f, 21.0f, 9.7778f, 21.0f)
                close()
                moveTo(7.8333f, 13.4999f)
                curveTo(7.8333f, 11.2808f, 9.6988f, 9.482f, 12.0f, 9.482f)
                curveTo(14.3012f, 9.482f, 16.1667f, 11.2808f, 16.1667f, 13.4999f)
                curveTo(16.1667f, 15.7189f, 14.3012f, 17.5178f, 12.0f, 17.5178f)
                curveTo(9.6988f, 17.5178f, 7.8333f, 15.7189f, 7.8333f, 13.4999f)
                close()
                moveTo(9.5f, 13.4999f)
                curveTo(9.5f, 12.1685f, 10.6193f, 11.0891f, 12.0f, 11.0891f)
                curveTo(13.3807f, 11.0891f, 14.5f, 12.1685f, 14.5f, 13.4999f)
                curveTo(14.5f, 14.8313f, 13.3807f, 15.9106f, 12.0f, 15.9106f)
                curveTo(10.6193f, 15.9106f, 9.5f, 14.8313f, 9.5f, 13.4999f)
                close()
                moveTo(18.1111f, 9.482f)
                curveTo(17.6509f, 9.482f, 17.2778f, 9.8417f, 17.2778f, 10.2855f)
                curveTo(17.2778f, 10.7294f, 17.6509f, 11.0891f, 18.1111f, 11.0891f)
                horizontalLineTo(18.6667f)
                curveTo(19.1269f, 11.0891f, 19.5f, 10.7294f, 19.5f, 10.2855f)
                curveTo(19.5f, 9.8417f, 19.1269f, 9.482f, 18.6667f, 9.482f)
                horizontalLineTo(18.1111f)
                close()
            }
        }
            .build()
        return _cameraMinimalistic!!
    }

private var _cameraMinimalistic: ImageVector? = null

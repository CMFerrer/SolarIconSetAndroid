package com.chiksmedina.solar.outline.security

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
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(
            name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 10.0649f)
                curveTo(14.5858f, 10.0649f, 14.25f, 10.4007f, 14.25f, 10.8149f)
                curveTo(14.25f, 11.2292f, 14.5858f, 11.5649f, 15.0f, 11.5649f)
                curveTo(15.842f, 11.5649f, 16.4637f, 12.2034f, 16.4356f, 12.9727f)
                curveTo(16.4205f, 13.3866f, 16.7438f, 13.7344f, 17.1577f, 13.7495f)
                curveTo(17.5717f, 13.7646f, 17.9195f, 13.4413f, 17.9346f, 13.0274f)
                curveTo(17.9963f, 11.3367f, 16.618f, 10.0649f, 15.0f, 10.0649f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9664f, 7.25f)
                curveTo(10.5947f, 7.25f, 9.5193f, 7.25f, 8.6549f, 7.3206f)
                curveTo(7.7748f, 7.3925f, 7.0477f, 7.5414f, 6.3896f, 7.8767f)
                curveTo(5.3076f, 8.428f, 4.428f, 9.3076f, 3.8767f, 10.3896f)
                curveTo(3.5414f, 11.0477f, 3.3925f, 11.7748f, 3.3206f, 12.6549f)
                curveTo(3.25f, 13.5193f, 3.25f, 14.5947f, 3.25f, 15.9664f)
                lineTo(3.25f, 21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(20.75f)
                verticalLineTo(15.9664f)
                curveTo(20.75f, 14.5949f, 20.75f, 13.5192f, 20.6794f, 12.6549f)
                curveTo(20.6075f, 11.7748f, 20.4586f, 11.0477f, 20.1233f, 10.3896f)
                curveTo(19.572f, 9.3076f, 18.6924f, 8.428f, 17.6104f, 7.8767f)
                curveTo(16.9523f, 7.5414f, 16.2252f, 7.3925f, 15.3451f, 7.3206f)
                curveTo(14.4807f, 7.25f, 13.4053f, 7.25f, 12.0336f, 7.25f)
                horizontalLineTo(11.9664f)
                close()
                moveTo(12.75f, 21.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(16.0f)
                curveTo(19.25f, 14.5875f, 19.2494f, 13.5732f, 19.1844f, 12.7771f)
                curveTo(19.12f, 11.9897f, 18.9964f, 11.482f, 18.7868f, 11.0705f)
                curveTo(18.3793f, 10.2709f, 17.7291f, 9.6207f, 16.9295f, 9.2132f)
                curveTo(16.518f, 9.0036f, 16.0103f, 8.88f, 15.2229f, 8.8156f)
                curveTo(14.4268f, 8.7506f, 13.4125f, 8.75f, 12.0f, 8.75f)
                curveTo(10.5875f, 8.75f, 9.5732f, 8.7506f, 8.7771f, 8.8156f)
                curveTo(7.9897f, 8.88f, 7.482f, 9.0036f, 7.0705f, 9.2132f)
                curveTo(6.2709f, 9.6207f, 5.6207f, 10.2709f, 5.2132f, 11.0705f)
                curveTo(5.0036f, 11.482f, 4.88f, 11.9897f, 4.8156f, 12.7771f)
                curveTo(4.7506f, 13.5732f, 4.75f, 14.5875f, 4.75f, 16.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.622f)
                curveTo(10.3761f, 19.3131f, 9.75f, 18.4797f, 9.75f, 17.5f)
                curveTo(9.75f, 16.2574f, 10.7574f, 15.25f, 12.0f, 15.25f)
                curveTo(13.2426f, 15.25f, 14.25f, 16.2574f, 14.25f, 17.5f)
                curveTo(14.25f, 18.4797f, 13.6239f, 19.3131f, 12.75f, 19.622f)
                verticalLineTo(21.25f)
                close()
                moveTo(12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 17.9142f, 12.75f, 17.5f)
                curveTo(12.75f, 17.0858f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 17.0858f, 11.25f, 17.5f)
                curveTo(11.25f, 17.9142f, 11.5858f, 18.25f, 12.0f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5303f, 5.5303f)
                lineTo(20.0303f, 7.0303f)
                curveTo(19.7374f, 7.3232f, 19.2626f, 7.3232f, 18.9697f, 7.0303f)
                curveTo(18.6768f, 6.7374f, 18.6768f, 6.2626f, 18.9697f, 5.9697f)
                lineTo(20.4697f, 4.4697f)
                curveTo(20.7626f, 4.1768f, 21.2374f, 4.1768f, 21.5303f, 4.4697f)
                curveTo(21.8232f, 4.7626f, 21.8232f, 5.2374f, 21.5303f, 5.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5303f, 4.4697f)
                curveTo(3.2374f, 4.1768f, 2.7626f, 4.1768f, 2.4697f, 4.4697f)
                curveTo(2.1768f, 4.7626f, 2.1768f, 5.2374f, 2.4697f, 5.5303f)
                lineTo(3.9697f, 7.0303f)
                curveTo(4.2626f, 7.3232f, 4.7374f, 7.3232f, 5.0303f, 7.0303f)
                curveTo(5.3232f, 6.7374f, 5.3232f, 6.2626f, 5.0303f, 5.9697f)
                lineTo(3.5303f, 4.4697f)
                close()
            }
        }
            .build()
        return _siren!!
    }

private var _siren: ImageVector? = null

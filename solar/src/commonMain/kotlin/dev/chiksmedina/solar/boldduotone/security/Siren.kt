package dev.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SecurityGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 21.25f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 13.1997f, 20.0f, 11.7996f, 19.455f, 10.73f)
                curveTo(18.9757f, 9.7892f, 18.2108f, 9.0243f, 17.27f, 8.545f)
                curveTo(16.2004f, 8.0f, 14.8003f, 8.0f, 12.0f, 8.0f)
                curveTo(9.1997f, 8.0f, 7.7996f, 8.0f, 6.7301f, 8.545f)
                curveTo(5.7892f, 9.0243f, 5.0243f, 9.7892f, 4.545f, 10.73f)
                curveTo(4.0f, 11.7996f, 4.0f, 13.1997f, 4.0f, 16.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.25f, 10.8149f)
                curveTo(14.25f, 10.4007f, 14.5858f, 10.0649f, 15.0f, 10.0649f)
                curveTo(16.618f, 10.0649f, 17.9963f, 11.3367f, 17.9346f, 13.0274f)
                curveTo(17.9195f, 13.4413f, 17.5717f, 13.7646f, 17.1577f, 13.7495f)
                curveTo(16.7438f, 13.7344f, 16.4205f, 13.3866f, 16.4356f, 12.9727f)
                curveTo(16.4637f, 12.2034f, 15.842f, 11.5649f, 15.0f, 11.5649f)
                curveTo(14.5858f, 11.5649f, 14.25f, 11.2292f, 14.25f, 10.8149f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 18.7993f)
                curveTo(13.1984f, 18.54f, 13.5f, 18.0552f, 13.5f, 17.5f)
                curveTo(13.5f, 16.6716f, 12.8284f, 16.0f, 12.0f, 16.0f)
                curveTo(11.1716f, 16.0f, 10.5f, 16.6716f, 10.5f, 17.5f)
                curveTo(10.5f, 18.0552f, 10.8016f, 18.54f, 11.25f, 18.7993f)
                verticalLineTo(21.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.7993f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(12.75f, 5.4142f, 12.4142f, 5.75f, 12.0f, 5.75f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
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

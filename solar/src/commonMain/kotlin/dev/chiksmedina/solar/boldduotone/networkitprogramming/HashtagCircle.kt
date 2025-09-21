package dev.chiksmedina.solar.boldduotone.networkitprogramming

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
import dev.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.HashtagCircle: ImageVector
    get() {
        if (_hashtagCircle != null) {
            return _hashtagCircle!!
        }
        _hashtagCircle = Builder(
            name = "HashtagCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.7184f, 7.2155f)
                curveTo(11.8374f, 6.8187f, 11.6123f, 6.4006f, 11.2155f, 6.2816f)
                curveTo(10.8188f, 6.1626f, 10.4007f, 6.3877f, 10.2816f, 6.7844f)
                lineTo(9.542f, 9.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 9.25f, 6.25f, 9.5857f, 6.25f, 10.0f)
                curveTo(6.25f, 10.4142f, 6.5858f, 10.75f, 7.0f, 10.75f)
                horizontalLineTo(9.092f)
                lineTo(8.342f, 13.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 13.25f, 5.25f, 13.5857f, 5.25f, 14.0f)
                curveTo(5.25f, 14.4142f, 5.5858f, 14.75f, 6.0f, 14.75f)
                horizontalLineTo(7.892f)
                lineTo(7.2816f, 16.7844f)
                curveTo(7.1626f, 17.1812f, 7.3877f, 17.5993f, 7.7845f, 17.7183f)
                curveTo(8.1812f, 17.8373f, 8.5993f, 17.6122f, 8.7184f, 17.2155f)
                lineTo(9.458f, 14.75f)
                horizontalLineTo(12.892f)
                lineTo(12.2816f, 16.7844f)
                curveTo(12.1626f, 17.1812f, 12.3877f, 17.5993f, 12.7845f, 17.7183f)
                curveTo(13.1812f, 17.8373f, 13.5993f, 17.6122f, 13.7184f, 17.2155f)
                lineTo(14.458f, 14.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 14.75f, 17.75f, 14.4142f, 17.75f, 14.0f)
                curveTo(17.75f, 13.5857f, 17.4142f, 13.25f, 17.0f, 13.25f)
                horizontalLineTo(14.908f)
                lineTo(15.658f, 10.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 10.75f, 18.75f, 10.4142f, 18.75f, 10.0f)
                curveTo(18.75f, 9.5857f, 18.4142f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(16.108f)
                lineTo(16.7184f, 7.2155f)
                curveTo(16.8374f, 6.8187f, 16.6123f, 6.4006f, 16.2155f, 6.2816f)
                curveTo(15.8188f, 6.1626f, 15.4007f, 6.3877f, 15.2816f, 6.7844f)
                lineTo(14.542f, 9.25f)
                horizontalLineTo(11.108f)
                lineTo(11.7184f, 7.2155f)
                close()
                moveTo(14.092f, 10.75f)
                lineTo(13.342f, 13.25f)
                horizontalLineTo(9.908f)
                lineTo(10.658f, 10.75f)
                horizontalLineTo(14.092f)
                close()
            }
        }
            .build()
        return _hashtagCircle!!
    }

private var _hashtagCircle: ImageVector? = null

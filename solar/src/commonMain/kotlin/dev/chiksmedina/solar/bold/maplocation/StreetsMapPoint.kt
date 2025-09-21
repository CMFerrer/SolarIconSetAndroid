package dev.chiksmedina.solar.bold.maplocation

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
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.StreetsMapPoint: ImageVector
    get() {
        if (_streetsMapPoint != null) {
            return _streetsMapPoint!!
        }
        _streetsMapPoint = Builder(
            name = "StreetsMapPoint", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.8891f, 7.1716f)
                curveTo(22.0f, 8.4332f, 22.0f, 10.0056f, 22.0f, 12.0f)
                curveTo(22.0f, 16.1337f, 22.0f, 18.4549f, 21.0126f, 19.9513f)
                lineTo(15.0611f, 13.9998f)
                lineTo(21.8891f, 7.1716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.952f, 21.0121f)
                lineTo(14.0004f, 15.0605f)
                lineTo(7.1717f, 21.8891f)
                curveTo(8.4332f, 22.0f, 10.0056f, 22.0f, 12.0f, 22.0f)
                curveTo(16.1343f, 22.0f, 18.4557f, 22.0f, 19.952f, 21.0121f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.0394f, 3.9683f, 21.3699f, 4.5779f, 21.5867f, 5.3527f)
                lineTo(5.3527f, 21.5867f)
                curveTo(4.5779f, 21.3699f, 3.9683f, 21.0394f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.5f, 8.7573f)
                curveTo(5.5f, 10.5422f, 6.6171f, 12.625f, 8.36f, 13.3698f)
                curveTo(8.7663f, 13.5434f, 9.2337f, 13.5434f, 9.64f, 13.3698f)
                curveTo(11.3829f, 12.625f, 12.5f, 10.5422f, 12.5f, 8.7573f)
                curveTo(12.5f, 6.9584f, 10.933f, 5.5f, 9.0f, 5.5f)
                curveTo(7.067f, 5.5f, 5.5f, 6.9584f, 5.5f, 8.7573f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5f, 9.0f)
                curveTo(10.5f, 9.8284f, 9.8284f, 10.5f, 9.0f, 10.5f)
                curveTo(8.1716f, 10.5f, 7.5f, 9.8284f, 7.5f, 9.0f)
                curveTo(7.5f, 8.1716f, 8.1716f, 7.5f, 9.0f, 7.5f)
                curveTo(9.8284f, 7.5f, 10.5f, 8.1716f, 10.5f, 9.0f)
                close()
            }
        }
            .build()
        return _streetsMapPoint!!
    }

private var _streetsMapPoint: ImageVector? = null

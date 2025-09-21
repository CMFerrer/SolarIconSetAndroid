package dev.chiksmedina.solar.bold.designtools

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
import dev.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(
            name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.1136f, 22.0f)
                horizontalLineTo(5.8864f)
                curveTo(4.1842f, 22.0f, 3.3332f, 22.0f, 3.054f, 21.4576f)
                curveTo(2.7749f, 20.9152f, 3.2696f, 20.2226f, 4.2589f, 18.8375f)
                lineTo(5.3884f, 17.2563f)
                curveTo(5.8283f, 16.6404f, 6.0482f, 16.3325f, 6.3713f, 16.1662f)
                curveTo(6.6943f, 16.0f, 7.0727f, 16.0f, 7.8296f, 16.0f)
                horizontalLineTo(16.1704f)
                curveTo(16.9273f, 16.0f, 17.3057f, 16.0f, 17.6287f, 16.1662f)
                curveTo(17.9518f, 16.3325f, 18.1717f, 16.6404f, 18.6116f, 17.2563f)
                lineTo(19.7411f, 18.8375f)
                curveTo(20.7304f, 20.2226f, 21.2251f, 20.9152f, 20.946f, 21.4576f)
                curveTo(20.6668f, 22.0f, 19.8158f, 22.0f, 18.1136f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.1136f, 2.0f)
                lineTo(5.8864f, 2.0f)
                curveTo(4.1842f, 2.0f, 3.3332f, 2.0f, 3.054f, 2.5424f)
                curveTo(2.7749f, 3.0848f, 3.2696f, 3.7774f, 4.2589f, 5.1625f)
                lineTo(5.3884f, 6.7437f)
                curveTo(5.8283f, 7.3596f, 6.0482f, 7.6675f, 6.3713f, 7.8337f)
                curveTo(6.6943f, 8.0f, 7.0727f, 8.0f, 7.8296f, 8.0f)
                lineTo(16.1704f, 8.0f)
                curveTo(16.9273f, 8.0f, 17.3057f, 8.0f, 17.6287f, 7.8337f)
                curveTo(17.9518f, 7.6675f, 18.1717f, 7.3596f, 18.6116f, 6.7437f)
                lineTo(19.7411f, 5.1625f)
                curveTo(20.7304f, 3.7774f, 21.2251f, 3.0848f, 20.946f, 2.5424f)
                curveTo(20.6668f, 2.0f, 19.8158f, 2.0f, 18.1136f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(6.0f)
                curveTo(6.4142f, 11.25f, 6.75f, 11.5858f, 6.75f, 12.0f)
                curveTo(6.75f, 12.4142f, 6.4142f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.25f, 14.75f, 11.5858f, 14.75f, 12.0f)
                curveTo(14.75f, 12.4142f, 14.4142f, 12.75f, 14.0f, 12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 12.75f, 9.25f, 12.4142f, 9.25f, 12.0f)
                close()
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 11.5858f, 17.5858f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 12.75f, 17.25f, 12.4142f, 17.25f, 12.0f)
                close()
            }
        }
            .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null

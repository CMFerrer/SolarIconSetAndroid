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

val DesignToolsGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(
            name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.1136f)
                verticalLineTo(5.8864f)
                curveTo(2.0f, 4.1842f, 2.0f, 3.3332f, 2.5424f, 3.054f)
                curveTo(3.0848f, 2.7749f, 3.7774f, 3.2696f, 5.1625f, 4.2589f)
                lineTo(6.7437f, 5.3884f)
                curveTo(7.3596f, 5.8283f, 7.6675f, 6.0482f, 7.8337f, 6.3713f)
                curveTo(8.0f, 6.6943f, 8.0f, 7.0727f, 8.0f, 7.8296f)
                verticalLineTo(16.1704f)
                curveTo(8.0f, 16.9273f, 8.0f, 17.3057f, 7.8337f, 17.6287f)
                curveTo(7.6675f, 17.9518f, 7.3596f, 18.1717f, 6.7437f, 18.6116f)
                lineTo(5.1625f, 19.7411f)
                curveTo(3.7774f, 20.7304f, 3.0848f, 21.2251f, 2.5424f, 20.946f)
                curveTo(2.0f, 20.6668f, 2.0f, 19.8158f, 2.0f, 18.1136f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 18.1136f)
                verticalLineTo(5.8864f)
                curveTo(22.0f, 4.1842f, 22.0f, 3.3332f, 21.4576f, 3.054f)
                curveTo(20.9152f, 2.7749f, 20.2226f, 3.2696f, 18.8375f, 4.2589f)
                lineTo(17.2563f, 5.3884f)
                curveTo(16.6404f, 5.8283f, 16.3325f, 6.0482f, 16.1662f, 6.3713f)
                curveTo(16.0f, 6.6943f, 16.0f, 7.0727f, 16.0f, 7.8296f)
                verticalLineTo(16.1704f)
                curveTo(16.0f, 16.9273f, 16.0f, 17.3057f, 16.1662f, 17.6287f)
                curveTo(16.3325f, 17.9518f, 16.6404f, 18.1717f, 17.2563f, 18.6116f)
                lineTo(18.8375f, 19.7411f)
                curveTo(20.2226f, 20.7304f, 20.9152f, 21.2251f, 21.4576f, 20.946f)
                curveTo(22.0f, 20.6668f, 22.0f, 19.8158f, 22.0f, 18.1136f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(6.0f)
                curveTo(12.75f, 6.4142f, 12.4142f, 6.75f, 12.0f, 6.75f)
                curveTo(11.5858f, 6.75f, 11.25f, 6.4142f, 11.25f, 6.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 17.5858f, 11.5858f, 17.25f, 12.0f, 17.25f)
                close()
            }
        }
            .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null

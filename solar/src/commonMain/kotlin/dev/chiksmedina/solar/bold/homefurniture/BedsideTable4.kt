package dev.chiksmedina.solar.bold.homefurniture

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
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.BedsideTable4: ImageVector
    get() {
        if (_bedsideTable4 != null) {
            return _bedsideTable4!!
        }
        _bedsideTable4 = Builder(
            name = "BedsideTable4", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 9.75f)
                curveTo(2.0f, 9.3081f, 2.0f, 8.892f, 2.0019f, 8.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.75f)
                lineTo(10.0f, 19.75f)
                curveTo(8.1936f, 19.75f, 6.8199f, 19.75f, 5.75f, 19.6213f)
                verticalLineTo(21.75f)
                curveTo(5.75f, 22.1642f, 5.4142f, 22.5f, 5.0f, 22.5f)
                curveTo(4.5858f, 22.5f, 4.25f, 22.1642f, 4.25f, 21.75f)
                verticalLineTo(19.2749f)
                curveTo(3.8286f, 19.1082f, 3.476f, 18.8828f, 3.1716f, 18.5784f)
                curveTo(2.0f, 17.4069f, 2.0f, 15.5212f, 2.0f, 11.75f)
                verticalLineTo(9.75f)
                close()
                moveTo(9.0f, 11.0f)
                curveTo(9.4142f, 11.0f, 9.75f, 11.3358f, 9.75f, 11.75f)
                verticalLineTo(14.75f)
                curveTo(9.75f, 15.1642f, 9.4142f, 15.5f, 9.0f, 15.5f)
                curveTo(8.5858f, 15.5f, 8.25f, 15.1642f, 8.25f, 14.75f)
                verticalLineTo(11.75f)
                curveTo(8.25f, 11.3358f, 8.5858f, 11.0f, 9.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.9743f, 7.0f)
                horizontalLineTo(2.0257f)
                curveTo(2.0919f, 4.9788f, 2.328f, 3.7651f, 3.1716f, 2.9216f)
                curveTo(4.3432f, 1.75f, 6.2288f, 1.75f, 10.0f, 1.75f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 1.75f, 19.6569f, 1.75f, 20.8284f, 2.9216f)
                curveTo(21.672f, 3.7651f, 21.9082f, 4.9788f, 21.9743f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.75f, 8.5f)
                horizontalLineTo(21.9981f)
                curveTo(22.0f, 8.892f, 22.0f, 9.3081f, 22.0f, 9.75f)
                verticalLineTo(11.75f)
                curveTo(22.0f, 15.5212f, 22.0f, 17.4069f, 20.8284f, 18.5784f)
                curveTo(20.524f, 18.8828f, 20.1714f, 19.1082f, 19.75f, 19.2749f)
                verticalLineTo(21.75f)
                curveTo(19.75f, 22.1642f, 19.4142f, 22.5f, 19.0f, 22.5f)
                curveTo(18.5858f, 22.5f, 18.25f, 22.1642f, 18.25f, 21.75f)
                verticalLineTo(19.6213f)
                curveTo(17.1801f, 19.75f, 15.8064f, 19.75f, 14.0f, 19.75f)
                lineTo(12.75f, 19.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(15.4142f, 11.0f, 15.75f, 11.3358f, 15.75f, 11.75f)
                verticalLineTo(14.75f)
                curveTo(15.75f, 15.1642f, 15.4142f, 15.5f, 15.0f, 15.5f)
                curveTo(14.5858f, 15.5f, 14.25f, 15.1642f, 14.25f, 14.75f)
                verticalLineTo(11.75f)
                curveTo(14.25f, 11.3358f, 14.5858f, 11.0f, 15.0f, 11.0f)
                close()
            }
        }
            .build()
        return _bedsideTable4!!
    }

private var _bedsideTable4: ImageVector? = null

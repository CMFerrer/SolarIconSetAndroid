package dev.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.BedsideTable3: ImageVector
    get() {
        if (_bedsideTable3 != null) {
            return _bedsideTable3!!
        }
        _bedsideTable3 = Builder(
            name = "BedsideTable3", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.25f, 6.5f)
                curveTo(8.25f, 6.0858f, 8.5858f, 5.75f, 9.0f, 5.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.75f, 15.75f, 6.0858f, 15.75f, 6.5f)
                curveTo(15.75f, 6.9142f, 15.4142f, 7.25f, 15.0f, 7.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 7.25f, 8.25f, 6.9142f, 8.25f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 11.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(20.524f, 19.1328f, 20.1714f, 19.3582f, 19.75f, 19.5249f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(19.8713f)
                curveTo(17.1801f, 20.0f, 15.8064f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(8.1936f, 20.0f, 6.8199f, 20.0f, 5.75f, 19.8713f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                verticalLineTo(19.5249f)
                curveTo(3.8286f, 19.3582f, 3.476f, 19.1328f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                verticalLineTo(11.75f)
                close()
                moveTo(8.25f, 15.5f)
                curveTo(8.25f, 15.0858f, 8.5858f, 14.75f, 9.0f, 14.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 14.75f, 15.75f, 15.0858f, 15.75f, 15.5f)
                curveTo(15.75f, 15.9142f, 15.4142f, 16.25f, 15.0f, 16.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 16.25f, 8.25f, 15.9142f, 8.25f, 15.5f)
                close()
            }
        }
            .build()
        return _bedsideTable3!!
    }

private var _bedsideTable3: ImageVector? = null

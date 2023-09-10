package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.BedsideTable2: ImageVector
    get() {
        if (_bedsideTable2 != null) {
            return _bedsideTable2!!
        }
        _bedsideTable2 = Builder(
            name = "BedsideTable2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1715f, 18.8284f)
                curveTo(2.328f, 17.9849f, 2.0918f, 16.7712f, 2.0256f, 14.75f)
                lineTo(1.9998f, 14.0f)
                horizontalLineTo(21.9742f)
                verticalLineTo(14.75f)
                curveTo(21.9081f, 16.7712f, 21.6719f, 17.9849f, 20.8283f, 18.8284f)
                curveTo(20.5239f, 19.1328f, 20.1713f, 19.3582f, 19.7499f, 19.5249f)
                verticalLineTo(22.0f)
                curveTo(19.7499f, 22.4142f, 19.4141f, 22.75f, 18.9999f, 22.75f)
                curveTo(18.5857f, 22.75f, 18.2499f, 22.4142f, 18.2499f, 22.0f)
                verticalLineTo(19.8713f)
                curveTo(17.18f, 20.0f, 15.8063f, 20.0f, 13.9999f, 20.0f)
                horizontalLineTo(9.9999f)
                curveTo(8.1936f, 20.0f, 6.8198f, 20.0f, 5.7499f, 19.8713f)
                verticalLineTo(22.0f)
                curveTo(5.7499f, 22.4142f, 5.4141f, 22.75f, 4.9999f, 22.75f)
                curveTo(4.5857f, 22.75f, 4.2499f, 22.4142f, 4.2499f, 22.0f)
                verticalLineTo(19.5249f)
                curveTo(3.8285f, 19.3582f, 3.4759f, 19.1328f, 3.1715f, 18.8284f)
                close()
                moveTo(12.9999f, 17.0f)
                curveTo(12.9999f, 17.5523f, 12.5522f, 18.0f, 11.9999f, 18.0f)
                curveTo(11.4476f, 18.0f, 10.9999f, 17.5523f, 10.9999f, 17.0f)
                curveTo(10.9999f, 16.4477f, 11.4476f, 16.0f, 11.9999f, 16.0f)
                curveTo(12.5522f, 16.0f, 12.9999f, 16.4477f, 12.9999f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.1715f, 3.1716f)
                curveTo(2.328f, 4.0151f, 2.0918f, 5.2288f, 2.0256f, 7.25f)
                lineTo(1.9998f, 8.0f)
                horizontalLineTo(21.9998f)
                lineTo(21.9742f, 7.25f)
                curveTo(21.9081f, 5.2288f, 21.6719f, 4.0151f, 20.8283f, 3.1716f)
                curveTo(19.6568f, 2.0f, 17.7712f, 2.0f, 13.9999f, 2.0f)
                horizontalLineTo(9.9999f)
                curveTo(6.2287f, 2.0f, 4.3431f, 2.0f, 3.1715f, 3.1716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 9.5581f, 2.0019f, 8.392f, 2.0038f, 8.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0019f, 8.392f, 22.0f, 9.5581f, 22.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 12.4419f, 22.0f, 13.608f, 21.9981f, 14.0f)
                horizontalLineTo(2.0019f)
                curveTo(2.0f, 13.608f, 2.0f, 12.4419f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
            .build()
        return _bedsideTable2!!
    }

private var _bedsideTable2: ImageVector? = null

package com.chiksmedina.solar.linear.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.HomeFurnitureGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(20.5f)
                moveTo(5.0f, 22.0f)
                verticalLineTo(20.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 12.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.0f)
                horizontalLineTo(22.0f)
            }
        }
            .build()
        return _bedsideTable4!!
    }

private var _bedsideTable4: ImageVector? = null

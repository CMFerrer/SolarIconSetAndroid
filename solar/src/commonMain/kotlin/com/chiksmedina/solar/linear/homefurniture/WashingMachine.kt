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

val HomeFurnitureGroup.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) {
            return _washingMachine!!
        }
        _washingMachine = Builder(
            name = "WashingMachine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 22.0f)
                verticalLineTo(21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 22.0f)
                verticalLineTo(21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 16.7712f, 21.0f, 18.6569f, 19.8284f, 19.8284f)
                curveTo(18.6569f, 21.0f, 16.7712f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 21.0f, 5.3432f, 21.0f, 4.1716f, 19.8284f)
                curveTo(3.0f, 18.6569f, 3.0f, 16.7712f, 3.0f, 13.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 9.0f)
                horizontalLineTo(21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 15.0f)
                curveTo(15.0f, 16.6569f, 13.6569f, 18.0f, 12.0f, 18.0f)
                curveTo(10.3431f, 18.0f, 9.0f, 16.6569f, 9.0f, 15.0f)
                curveTo(9.0f, 13.3431f, 10.3431f, 12.0f, 12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 13.3431f, 15.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 5.5f)
                horizontalLineTo(9.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5f, 5.5f)
                curveTo(15.5f, 6.0523f, 15.0523f, 6.5f, 14.5f, 6.5f)
                curveTo(13.9477f, 6.5f, 13.5f, 6.0523f, 13.5f, 5.5f)
                curveTo(13.5f, 4.9477f, 13.9477f, 4.5f, 14.5f, 4.5f)
                curveTo(15.0523f, 4.5f, 15.5f, 4.9477f, 15.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5f, 5.5f)
                curveTo(18.5f, 6.0523f, 18.0523f, 6.5f, 17.5f, 6.5f)
                curveTo(16.9477f, 6.5f, 16.5f, 6.0523f, 16.5f, 5.5f)
                curveTo(16.5f, 4.9477f, 16.9477f, 4.5f, 17.5f, 4.5f)
                curveTo(18.0523f, 4.5f, 18.5f, 4.9477f, 18.5f, 5.5f)
                close()
            }
        }
            .build()
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null

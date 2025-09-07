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

val HomeFurnitureGroup.Condicioner: ImageVector
    get() {
        if (_condicioner != null) {
            return _condicioner!!
        }
        _condicioner = Builder(
            name = "Condicioner", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 7.5714f)
                curveTo(2.0f, 5.1573f, 2.0f, 3.9502f, 2.6545f, 3.1295f)
                curveTo(2.7946f, 2.9539f, 2.9539f, 2.7946f, 3.1295f, 2.6545f)
                curveTo(3.9502f, 2.0f, 5.1573f, 2.0f, 7.5714f, 2.0f)
                horizontalLineTo(16.4286f)
                curveTo(18.8427f, 2.0f, 20.0497f, 2.0f, 20.8705f, 2.6545f)
                curveTo(21.0461f, 2.7946f, 21.2054f, 2.9539f, 21.3455f, 3.1295f)
                curveTo(22.0f, 3.9502f, 22.0f, 5.1573f, 22.0f, 7.5714f)
                curveTo(22.0f, 10.7902f, 22.0f, 12.3997f, 21.1273f, 13.494f)
                curveTo(20.9406f, 13.7281f, 20.7281f, 13.9406f, 20.494f, 14.1273f)
                curveTo(19.3997f, 15.0f, 17.7903f, 15.0f, 14.5714f, 15.0f)
                horizontalLineTo(9.4286f)
                curveTo(6.2098f, 15.0f, 4.6003f, 15.0f, 3.506f, 14.1273f)
                curveTo(3.2719f, 13.9406f, 3.0594f, 13.7281f, 2.8727f, 13.494f)
                curveTo(2.0f, 12.3997f, 2.0f, 10.7903f, 2.0f, 7.5714f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.9999f, 17.5f)
                lineTo(6.6933f, 17.9599f)
                curveTo(6.3043f, 18.5435f, 6.4389f, 19.3292f, 6.9999f, 19.75f)
                curveTo(7.561f, 20.1708f, 7.6956f, 20.9565f, 7.3066f, 21.5401f)
                lineTo(6.9999f, 22.0f)
                moveTo(12.0f, 17.5f)
                lineTo(11.6933f, 17.9599f)
                curveTo(11.3043f, 18.5435f, 11.4389f, 19.3292f, 12.0f, 19.75f)
                curveTo(12.561f, 20.1708f, 12.6956f, 20.9565f, 12.3066f, 21.5401f)
                lineTo(12.0f, 22.0f)
                moveTo(17.0f, 17.5f)
                lineTo(16.6933f, 17.9599f)
                curveTo(16.3043f, 18.5435f, 16.4389f, 19.3292f, 17.0f, 19.75f)
                curveTo(17.561f, 20.1708f, 17.6956f, 20.9565f, 17.3066f, 21.5401f)
                lineTo(17.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0001f, 14.5f)
                curveTo(18.0001f, 14.0353f, 18.0001f, 13.803f, 17.9616f, 13.6098f)
                curveTo(17.8038f, 12.8164f, 17.1836f, 12.1962f, 16.3902f, 12.0384f)
                curveTo(16.197f, 12.0f, 15.9647f, 12.0f, 15.5001f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(8.0682f, 12.0f, 7.6022f, 12.0f, 7.2347f, 12.1522f)
                curveTo(6.7446f, 12.3552f, 6.3553f, 12.7446f, 6.1523f, 13.2346f)
                curveTo(6.0301f, 13.5297f, 6.006f, 13.8881f, 6.0012f, 14.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.5f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.0f)
                horizontalLineTo(18.0f)
            }
        }
            .build()
        return _condicioner!!
    }

private var _condicioner: ImageVector? = null

package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.HomeSmile: ImageVector
    get() {
        if (_homeSmile != null) {
            return _homeSmile!!
        }
        _homeSmile = Builder(
            name = "HomeSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.2039f)
                curveTo(2.0f, 9.9155f, 2.0f, 8.7713f, 2.5192f, 7.8227f)
                curveTo(3.0384f, 6.8742f, 3.9869f, 6.2855f, 5.884f, 5.1081f)
                lineTo(7.884f, 3.8669f)
                curveTo(9.8894f, 2.6223f, 10.8921f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1079f, 2.0f, 14.1106f, 2.6223f, 16.116f, 3.8669f)
                lineTo(18.116f, 5.1081f)
                curveTo(20.0131f, 6.2855f, 20.9616f, 6.8742f, 21.4808f, 7.8227f)
                curveTo(22.0f, 8.7713f, 22.0f, 9.9155f, 22.0f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(22.0f, 17.6258f, 22.0f, 19.5763f, 20.8284f, 20.7881f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.7881f)
                curveTo(2.0f, 19.5763f, 2.0f, 17.6258f, 2.0f, 13.725f)
                verticalLineTo(12.2039f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 16.0f)
                curveTo(9.8504f, 16.6303f, 10.8846f, 17.0f, 12.0f, 17.0f)
                curveTo(13.1154f, 17.0f, 14.1496f, 16.6303f, 15.0f, 16.0f)
            }
        }
            .build()
        return _homeSmile!!
    }

private var _homeSmile: ImageVector? = null

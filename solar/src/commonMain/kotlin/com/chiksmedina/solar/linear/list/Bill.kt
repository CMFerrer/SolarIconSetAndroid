package com.chiksmedina.solar.linear.list

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
import com.chiksmedina.solar.linear.ListGroup

val ListGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(
            name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.27f)
                curveTo(20.0f, 13.6091f, 20.0f, 14.2787f, 19.7319f, 14.8691f)
                curveTo(19.4638f, 15.4595f, 18.9595f, 15.9004f, 17.951f, 16.7822f)
                lineTo(15.951f, 18.5309f)
                curveTo(14.0685f, 20.177f, 13.1272f, 21.0f, 12.0f, 21.0f)
                curveTo(10.8728f, 21.0f, 9.9315f, 20.177f, 8.049f, 18.5309f)
                lineTo(6.049f, 16.7822f)
                curveTo(5.0405f, 15.9004f, 4.5362f, 15.4595f, 4.2681f, 14.8691f)
                curveTo(4.0f, 14.2787f, 4.0f, 13.6091f, 4.0f, 12.27f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 13.0f)
                lineTo(15.5f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 8.0f)
                lineTo(15.5f, 8.0f)
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null

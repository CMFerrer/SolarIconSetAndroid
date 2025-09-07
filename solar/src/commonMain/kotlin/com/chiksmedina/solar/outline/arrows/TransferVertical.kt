package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.TransferVertical: ImageVector
    get() {
        if (_transferVertical != null) {
            return _transferVertical!!
        }
        _transferVertical = Builder(
            name = "TransferVertical", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.698f, 3.3135f)
                curveTo(13.9703f, 3.1937f, 14.2875f, 3.2462f, 14.5068f, 3.4471f)
                lineTo(20.5068f, 8.9472f)
                curveTo(20.8121f, 9.227f, 20.8328f, 9.7015f, 20.5529f, 10.0068f)
                curveTo(20.273f, 10.3121f, 19.7985f, 10.3328f, 19.4932f, 10.0529f)
                lineTo(14.75f, 5.7049f)
                lineTo(14.75f, 20.0f)
                curveTo(14.75f, 20.4142f, 14.4142f, 20.75f, 14.0f, 20.75f)
                curveTo(13.5858f, 20.75f, 13.25f, 20.4142f, 13.25f, 20.0f)
                lineTo(13.25f, 4.0f)
                curveTo(13.25f, 3.7026f, 13.4258f, 3.4333f, 13.698f, 3.3135f)
                close()
                moveTo(10.0f, 3.25f)
                curveTo(10.4142f, 3.25f, 10.75f, 3.5858f, 10.75f, 4.0f)
                lineTo(10.75f, 20.0f)
                curveTo(10.75f, 20.2974f, 10.5743f, 20.5668f, 10.302f, 20.6865f)
                curveTo(10.0298f, 20.8063f, 9.7125f, 20.7539f, 9.4932f, 20.5529f)
                lineTo(3.4932f, 15.0529f)
                curveTo(3.1879f, 14.773f, 3.1672f, 14.2986f, 3.4471f, 13.9932f)
                curveTo(3.727f, 13.6879f, 4.2015f, 13.6673f, 4.5068f, 13.9471f)
                lineTo(9.25f, 18.2951f)
                lineTo(9.25f, 4.0f)
                curveTo(9.25f, 3.5858f, 9.5858f, 3.25f, 10.0f, 3.25f)
                close()
            }
        }
            .build()
        return _transferVertical!!
    }

private var _transferVertical: ImageVector? = null

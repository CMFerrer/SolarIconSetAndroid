package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.TransferHorizontal: ImageVector
    get() {
        if (_transferHorizontal != null) {
            return _transferHorizontal!!
        }
        _transferHorizontal = Builder(
            name = "TransferHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.25f, 4.0f)
                curveTo(10.25f, 3.6907f, 10.0602f, 3.4132f, 9.7719f, 3.301f)
                curveTo(9.4837f, 3.1889f, 9.1561f, 3.2652f, 8.9472f, 3.4932f)
                lineTo(3.4471f, 9.4932f)
                curveTo(3.2462f, 9.7125f, 3.1937f, 10.0298f, 3.3135f, 10.302f)
                curveTo(3.4333f, 10.5743f, 3.7026f, 10.75f, 4.0f, 10.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 10.75f, 20.75f, 10.4142f, 20.75f, 10.0f)
                curveTo(20.75f, 9.5858f, 20.4142f, 9.25f, 20.0f, 9.25f)
                lineTo(10.25f, 9.25f)
                verticalLineTo(4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.75f, 20.0f)
                lineTo(13.75f, 14.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 14.75f, 3.25f, 14.4142f, 3.25f, 14.0f)
                curveTo(3.25f, 13.5858f, 3.5858f, 13.25f, 4.0f, 13.25f)
                lineTo(20.0f, 13.25f)
                curveTo(20.2974f, 13.25f, 20.5668f, 13.4258f, 20.6865f, 13.698f)
                curveTo(20.8063f, 13.9703f, 20.7539f, 14.2876f, 20.5529f, 14.5068f)
                lineTo(15.0529f, 20.5068f)
                curveTo(14.8439f, 20.7348f, 14.5164f, 20.8111f, 14.2281f, 20.699f)
                curveTo(13.9399f, 20.5869f, 13.75f, 20.3093f, 13.75f, 20.0f)
                close()
            }
        }
            .build()
        return _transferHorizontal!!
    }

private var _transferHorizontal: ImageVector? = null

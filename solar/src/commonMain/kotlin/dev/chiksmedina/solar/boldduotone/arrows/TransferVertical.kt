package dev.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

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
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.25f)
                curveTo(20.3093f, 10.25f, 20.5869f, 10.0602f, 20.699f, 9.7719f)
                curveTo(20.8111f, 9.4837f, 20.7348f, 9.1561f, 20.5068f, 8.9472f)
                lineTo(14.5068f, 3.4471f)
                curveTo(14.2875f, 3.2462f, 13.9703f, 3.1937f, 13.698f, 3.3135f)
                curveTo(13.4258f, 3.4333f, 13.25f, 3.7026f, 13.25f, 4.0f)
                lineTo(13.25f, 20.0f)
                curveTo(13.25f, 20.4142f, 13.5858f, 20.75f, 14.0f, 20.75f)
                curveTo(14.4142f, 20.75f, 14.75f, 20.4142f, 14.75f, 20.0f)
                lineTo(14.75f, 10.25f)
                lineTo(20.0f, 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 13.75f)
                lineTo(9.25f, 13.75f)
                lineTo(9.25f, 4.0f)
                curveTo(9.25f, 3.5858f, 9.5858f, 3.25f, 10.0f, 3.25f)
                curveTo(10.4142f, 3.25f, 10.75f, 3.5858f, 10.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(10.75f, 20.2974f, 10.5743f, 20.5667f, 10.302f, 20.6865f)
                curveTo(10.0298f, 20.8063f, 9.7125f, 20.7538f, 9.4932f, 20.5529f)
                lineTo(3.4932f, 15.0529f)
                curveTo(3.2652f, 14.8439f, 3.1889f, 14.5164f, 3.301f, 14.2281f)
                curveTo(3.4132f, 13.9399f, 3.6907f, 13.75f, 4.0f, 13.75f)
                close()
            }
        }
            .build()
        return _transferVertical!!
    }

private var _transferVertical: ImageVector? = null

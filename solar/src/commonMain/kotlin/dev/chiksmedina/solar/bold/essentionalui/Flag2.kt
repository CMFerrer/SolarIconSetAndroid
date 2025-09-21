package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Flag2: ImageVector
    get() {
        if (_flag2 != null) {
            return _flag2!!
        }
        _flag2 = Builder(
            name = "Flag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 1.0f)
                curveTo(6.1642f, 1.0f, 6.5f, 1.3358f, 6.5f, 1.75f)
                verticalLineTo(3.6f)
                lineTo(8.2207f, 3.2559f)
                curveTo(9.8712f, 2.9258f, 11.5821f, 3.0828f, 13.1449f, 3.708f)
                lineTo(13.5582f, 3.8733f)
                curveTo(14.9831f, 4.4432f, 16.5513f, 4.5497f, 18.0401f, 4.1775f)
                curveTo(18.6711f, 4.0197f, 19.1778f, 4.7036f, 18.8432f, 5.2613f)
                lineTo(17.5647f, 7.3922f)
                curveTo(17.2232f, 7.9614f, 17.0524f, 8.2459f, 17.0119f, 8.5555f)
                curveTo(16.9951f, 8.6846f, 16.9951f, 8.8154f, 17.0119f, 8.9445f)
                curveTo(17.0524f, 9.2541f, 17.2232f, 9.5386f, 17.5647f, 10.1078f)
                lineTo(19.1253f, 12.7089f)
                curveTo(19.4361f, 13.2269f, 19.1582f, 13.898f, 18.5721f, 14.0445f)
                lineTo(18.472f, 14.0695f)
                curveTo(16.7024f, 14.5119f, 14.8385f, 14.3854f, 13.1449f, 13.708f)
                curveTo(11.5821f, 13.0828f, 9.8712f, 12.9258f, 8.2207f, 13.2559f)
                lineTo(6.5f, 13.6f)
                verticalLineTo(21.75f)
                curveTo(6.5f, 22.1642f, 6.1642f, 22.5f, 5.75f, 22.5f)
                curveTo(5.3358f, 22.5f, 5.0f, 22.1642f, 5.0f, 21.75f)
                verticalLineTo(1.75f)
                curveTo(5.0f, 1.3358f, 5.3358f, 1.0f, 5.75f, 1.0f)
                close()
            }
        }
            .build()
        return _flag2!!
    }

private var _flag2: ImageVector? = null

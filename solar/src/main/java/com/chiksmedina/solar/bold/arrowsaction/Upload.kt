package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(
            name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 15.75f)
                curveTo(12.4142f, 15.75f, 12.75f, 15.4142f, 12.75f, 15.0f)
                verticalLineTo(4.0274f)
                lineTo(14.4306f, 5.9881f)
                curveTo(14.7001f, 6.3026f, 15.1736f, 6.339f, 15.4881f, 6.0694f)
                curveTo(15.8026f, 5.7999f, 15.839f, 5.3264f, 15.5694f, 5.0119f)
                lineTo(12.5694f, 1.5119f)
                curveTo(12.427f, 1.3457f, 12.2189f, 1.25f, 12.0f, 1.25f)
                curveTo(11.7811f, 1.25f, 11.573f, 1.3457f, 11.4306f, 1.5119f)
                lineTo(8.4306f, 5.0119f)
                curveTo(8.161f, 5.3264f, 8.1974f, 5.7999f, 8.5119f, 6.0694f)
                curveTo(8.8264f, 6.339f, 9.2999f, 6.3026f, 9.5694f, 5.9881f)
                lineTo(11.25f, 4.0274f)
                lineTo(11.25f, 15.0f)
                curveTo(11.25f, 15.4142f, 11.5858f, 15.75f, 12.0f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 9.0f)
                curveTo(15.2978f, 9.0f, 14.9467f, 9.0f, 14.6945f, 9.1685f)
                curveTo(14.5853f, 9.2415f, 14.4915f, 9.3352f, 14.4186f, 9.4445f)
                curveTo(14.25f, 9.6967f, 14.25f, 10.0478f, 14.25f, 10.75f)
                lineTo(14.25f, 15.0f)
                curveTo(14.25f, 16.2426f, 13.2427f, 17.25f, 12.0f, 17.25f)
                curveTo(10.7574f, 17.25f, 9.75f, 16.2426f, 9.75f, 15.0f)
                lineTo(9.75f, 10.75f)
                curveTo(9.75f, 10.0478f, 9.75f, 9.6966f, 9.5815f, 9.4444f)
                curveTo(9.5085f, 9.3352f, 9.4148f, 9.2415f, 9.3056f, 9.1685f)
                curveTo(9.0534f, 9.0f, 8.7023f, 9.0f, 8.0f, 9.0f)
                curveTo(5.1716f, 9.0f, 3.7574f, 9.0f, 2.8787f, 9.8787f)
                curveTo(2.0f, 10.7574f, 2.0f, 12.1714f, 2.0f, 14.9998f)
                verticalLineTo(15.9998f)
                curveTo(2.0f, 18.8282f, 2.0f, 20.2424f, 2.8787f, 21.1211f)
                curveTo(3.7574f, 21.9998f, 5.1716f, 21.9998f, 8.0f, 21.9998f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 21.9998f, 20.2426f, 21.9998f, 21.1213f, 21.1211f)
                curveTo(22.0f, 20.2424f, 22.0f, 18.8282f, 22.0f, 15.9998f)
                verticalLineTo(14.9998f)
                curveTo(22.0f, 12.1714f, 22.0f, 10.7574f, 21.1213f, 9.8787f)
                curveTo(20.2426f, 9.0f, 18.8284f, 9.0f, 16.0f, 9.0f)
                close()
            }
        }
            .build()
        return _upload!!
    }

private var _upload: ImageVector? = null

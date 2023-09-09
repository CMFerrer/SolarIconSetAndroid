package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.9998f)
                verticalLineTo(14.9998f)
                curveTo(22.0f, 12.1714f, 21.9998f, 10.7576f, 21.1211f, 9.8789f)
                curveTo(20.2424f, 9.0002f, 18.8282f, 9.0002f, 15.9998f, 9.0002f)
                horizontalLineTo(7.9998f)
                curveTo(5.1714f, 9.0002f, 3.7571f, 9.0002f, 2.8784f, 9.8789f)
                curveTo(2.0f, 10.7574f, 2.0f, 12.1706f, 2.0f, 14.9976f)
                verticalLineTo(14.9998f)
                verticalLineTo(15.9998f)
                curveTo(2.0f, 18.8282f, 2.0f, 20.2424f, 2.8787f, 21.1211f)
                curveTo(3.7574f, 21.9998f, 5.1716f, 21.9998f, 8.0f, 21.9998f)
                horizontalLineTo(16.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 21.9998f, 20.2426f, 21.9998f, 21.1213f, 21.1211f)
                curveTo(22.0f, 20.2424f, 22.0f, 18.8282f, 22.0f, 15.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 15.75f)
                curveTo(12.4142f, 15.75f, 12.75f, 15.4142f, 12.75f, 15.0f)
                lineTo(12.75f, 4.0274f)
                lineTo(14.4306f, 5.9881f)
                curveTo(14.7001f, 6.3026f, 15.1736f, 6.339f, 15.4881f, 6.0694f)
                curveTo(15.8026f, 5.7999f, 15.839f, 5.3264f, 15.5695f, 5.0119f)
                lineTo(12.5695f, 1.5119f)
                curveTo(12.427f, 1.3457f, 12.219f, 1.25f, 12.0f, 1.25f)
                curveTo(11.7811f, 1.25f, 11.5731f, 1.3457f, 11.4306f, 1.5119f)
                lineTo(8.4306f, 5.0119f)
                curveTo(8.161f, 5.3264f, 8.1974f, 5.7999f, 8.5119f, 6.0694f)
                curveTo(8.8264f, 6.339f, 9.2999f, 6.3026f, 9.5695f, 5.9881f)
                lineTo(11.25f, 4.0274f)
                lineTo(11.25f, 15.0f)
                curveTo(11.25f, 15.4142f, 11.5858f, 15.75f, 12.0f, 15.75f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null

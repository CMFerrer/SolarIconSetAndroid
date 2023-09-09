package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.CloseCircle: ImageVector
    get() {
        if (_closeCircle != null) {
            return _closeCircle!!
        }
        _closeCircle = Builder(name = "CloseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(8.9696f, 8.9697f)
                curveTo(9.2625f, 8.6768f, 9.7374f, 8.6768f, 10.0303f, 8.9697f)
                lineTo(12.0f, 10.9393f)
                lineTo(13.9696f, 8.9697f)
                curveTo(14.2625f, 8.6768f, 14.7374f, 8.6768f, 15.0303f, 8.9697f)
                curveTo(15.3232f, 9.2626f, 15.3232f, 9.7374f, 15.0303f, 10.0303f)
                lineTo(13.0606f, 12.0f)
                lineTo(15.0303f, 13.9696f)
                curveTo(15.3232f, 14.2625f, 15.3232f, 14.7374f, 15.0303f, 15.0303f)
                curveTo(14.7374f, 15.3232f, 14.2625f, 15.3232f, 13.9696f, 15.0303f)
                lineTo(12.0f, 13.0607f)
                lineTo(10.0303f, 15.0303f)
                curveTo(9.7374f, 15.3232f, 9.2625f, 15.3232f, 8.9697f, 15.0303f)
                curveTo(8.6768f, 14.7374f, 8.6768f, 14.2625f, 8.9697f, 13.9697f)
                lineTo(10.9393f, 12.0f)
                lineTo(8.9696f, 10.0303f)
                curveTo(8.6767f, 9.7374f, 8.6767f, 9.2625f, 8.9696f, 8.9697f)
                close()
            }
        }
        .build()
        return _closeCircle!!
    }

private var _closeCircle: ImageVector? = null

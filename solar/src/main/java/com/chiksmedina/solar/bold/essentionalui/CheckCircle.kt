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

val EssentionalUiGroup.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(
            name = "CheckCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(16.0303f, 8.9697f)
                curveTo(16.3232f, 9.2626f, 16.3232f, 9.7374f, 16.0303f, 10.0303f)
                lineTo(11.0303f, 15.0303f)
                curveTo(10.7374f, 15.3232f, 10.2626f, 15.3232f, 9.9697f, 15.0303f)
                lineTo(7.9697f, 13.0303f)
                curveTo(7.6768f, 12.7374f, 7.6768f, 12.2626f, 7.9697f, 11.9697f)
                curveTo(8.2626f, 11.6768f, 8.7374f, 11.6768f, 9.0303f, 11.9697f)
                lineTo(10.5f, 13.4393f)
                lineTo(12.7348f, 11.2045f)
                lineTo(14.9697f, 8.9697f)
                curveTo(15.2626f, 8.6768f, 15.7374f, 8.6768f, 16.0303f, 8.9697f)
                close()
            }
        }
            .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null

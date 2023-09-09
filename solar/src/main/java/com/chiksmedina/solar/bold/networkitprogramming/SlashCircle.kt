package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.SlashCircle: ImageVector
    get() {
        if (_slashCircle != null) {
            return _slashCircle!!
        }
        _slashCircle = Builder(name = "SlashCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.0184f, 7.3645f)
                curveTo(14.1257f, 6.9644f, 13.8882f, 6.5532f, 13.4881f, 6.446f)
                curveTo(13.088f, 6.3387f, 12.6768f, 6.5762f, 12.5696f, 6.9763f)
                lineTo(9.9814f, 16.6355f)
                curveTo(9.8742f, 17.0356f, 10.1116f, 17.4469f, 10.5117f, 17.5541f)
                curveTo(10.9118f, 17.6613f, 11.323f, 17.4239f, 11.4303f, 17.0238f)
                lineTo(14.0184f, 7.3645f)
                close()
            }
        }
        .build()
        return _slashCircle!!
    }

private var _slashCircle: ImageVector? = null

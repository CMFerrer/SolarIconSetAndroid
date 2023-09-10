package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(
            name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                lineTo(13.3486f, 3.7894f)
                curveTo(14.9097f, 4.4139f, 16.628f, 4.5305f, 18.2592f, 4.1227f)
                curveTo(19.0165f, 3.9334f, 19.75f, 4.5061f, 19.75f, 5.2867f)
                verticalLineTo(12.6537f)
                curveTo(19.75f, 13.298f, 19.3115f, 13.8596f, 18.6864f, 14.0159f)
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
        return _flag!!
    }

private var _flag: ImageVector? = null

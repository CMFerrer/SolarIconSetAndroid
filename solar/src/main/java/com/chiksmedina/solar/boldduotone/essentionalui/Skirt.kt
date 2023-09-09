package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Skirt: ImageVector
    get() {
        if (_skirt != null) {
            return _skirt!!
        }
        _skirt = Builder(name = "Skirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.9999f, 5.5f)
                horizontalLineTo(13.9999f)
                lineTo(15.9605f, 21.6781f)
                curveTo(14.8118f, 21.8754f, 13.4947f, 22.0f, 12.0f, 22.0f)
                curveTo(10.505f, 22.0f, 9.1876f, 21.8754f, 8.0386f, 21.6779f)
                lineTo(9.9999f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8376f, 5.5f)
                lineTo(2.0807f, 17.9529f)
                curveTo(1.8647f, 18.6686f, 2.0822f, 19.4379f, 2.7345f, 19.8293f)
                curveTo(3.7195f, 20.4202f, 5.4524f, 21.2335f, 8.0386f, 21.6779f)
                lineTo(9.9999f, 5.5f)
                horizontalLineTo(5.8376f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.2656f, 19.8293f)
                curveTo(21.9179f, 19.4379f, 22.1354f, 18.6686f, 21.9195f, 17.9529f)
                lineTo(18.1626f, 5.5f)
                horizontalLineTo(14.0f)
                lineTo(15.9607f, 21.6781f)
                curveTo(18.5473f, 21.2337f, 20.2806f, 20.4203f, 21.2656f, 19.8293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1086f, 2.0f)
                horizontalLineTo(7.892f)
                curveTo(6.9237f, 2.0f, 6.4395f, 2.0f, 6.1387f, 2.2929f)
                curveTo(5.8379f, 2.5858f, 5.8379f, 3.0572f, 5.8379f, 4.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(10.0002f)
                horizontalLineTo(14.0002f)
                horizontalLineTo(18.1628f)
                verticalLineTo(4.0f)
                curveTo(18.1628f, 3.0572f, 18.1628f, 2.5858f, 17.862f, 2.2929f)
                curveTo(17.5611f, 2.0f, 17.077f, 2.0f, 16.1086f, 2.0f)
                close()
            }
        }
        .build()
        return _skirt!!
    }

private var _skirt: ImageVector? = null

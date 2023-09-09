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

public val EssentionalUiGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6667f, 2.0f)
                horizontalLineTo(8.3333f)
                curveTo(6.4924f, 2.0f, 5.0f, 3.4924f, 5.0f, 5.3333f)
                curveTo(5.0f, 7.1743f, 6.4924f, 8.6667f, 8.3333f, 8.6667f)
                horizontalLineTo(11.6667f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6667f, 8.6665f)
                horizontalLineTo(8.3333f)
                curveTo(6.4924f, 8.6665f, 5.0f, 10.1589f, 5.0f, 11.9998f)
                curveTo(5.0f, 13.8408f, 6.4924f, 15.3332f, 8.3333f, 15.3332f)
                horizontalLineTo(11.6667f)
                verticalLineTo(8.6665f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3327f, 11.9998f)
                curveTo(18.3327f, 13.8408f, 16.8403f, 15.3332f, 14.9993f, 15.3332f)
                curveTo(13.1584f, 15.3332f, 11.666f, 13.8408f, 11.666f, 11.9998f)
                curveTo(11.666f, 10.1589f, 13.1584f, 8.6665f, 14.9993f, 8.6665f)
                curveTo(16.8403f, 8.6665f, 18.3327f, 10.1589f, 18.3327f, 11.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3333f, 15.3335f)
                horizontalLineTo(11.6667f)
                verticalLineTo(18.6668f)
                curveTo(11.6667f, 20.5078f, 10.1743f, 22.0002f, 8.3333f, 22.0002f)
                curveTo(6.4924f, 22.0002f, 5.0f, 20.5078f, 5.0f, 18.6668f)
                curveTo(5.0f, 16.8259f, 6.4924f, 15.3335f, 8.3333f, 15.3335f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.666f, 2.0f)
                horizontalLineTo(14.9993f)
                curveTo(16.8403f, 2.0f, 18.3327f, 3.4924f, 18.3327f, 5.3333f)
                curveTo(18.3327f, 7.1743f, 16.8403f, 8.6667f, 14.9993f, 8.6667f)
                horizontalLineTo(11.666f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null

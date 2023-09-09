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

public val EssentionalUiGroup.Cosmetic: ImageVector
    get() {
        if (_cosmetic != null) {
            return _cosmetic!!
        }
        _cosmetic = Builder(name = "Cosmetic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.5f)
                curveTo(2.0f, 11.2239f, 2.2239f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(7.5f)
                curveTo(7.7761f, 11.0f, 8.0f, 11.2239f, 8.0f, 11.5f)
                verticalLineTo(18.0f)
                curveTo(8.0f, 19.6569f, 6.6568f, 21.0f, 5.0f, 21.0f)
                curveTo(3.3431f, 21.0f, 2.0f, 19.6569f, 2.0f, 18.0f)
                verticalLineTo(11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0001f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.9999f)
                curveTo(7.0f, 5.2566f, 6.2177f, 4.7731f, 5.5528f, 5.1055f)
                lineTo(3.5528f, 6.1055f)
                curveTo(3.214f, 6.2749f, 3.0f, 6.6212f, 3.0f, 6.9999f)
                verticalLineTo(11.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.5f)
                curveTo(11.0f, 7.4624f, 13.4624f, 5.0f, 16.5f, 5.0f)
                curveTo(19.5376f, 5.0f, 22.0f, 7.4624f, 22.0f, 10.5f)
                curveTo(22.0f, 13.5376f, 19.5376f, 16.0f, 16.5f, 16.0f)
                curveTo(13.4624f, 16.0f, 11.0f, 13.5376f, 11.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 15.9493f)
                verticalLineTo(19.5002f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 19.5002f, 12.75f, 19.836f, 12.75f, 20.2502f)
                curveTo(12.75f, 20.6644f, 13.0858f, 21.0002f, 13.5f, 21.0002f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 21.0002f, 20.25f, 20.6644f, 20.25f, 20.2502f)
                curveTo(20.25f, 19.836f, 19.9142f, 19.5002f, 19.5f, 19.5002f)
                horizontalLineTo(17.25f)
                verticalLineTo(15.9493f)
                curveTo(17.0048f, 15.9828f, 16.7544f, 16.0001f, 16.5f, 16.0001f)
                curveTo(16.2456f, 16.0001f, 15.9952f, 15.9828f, 15.75f, 15.9493f)
                close()
            }
        }
        .build()
        return _cosmetic!!
    }

private var _cosmetic: ImageVector? = null

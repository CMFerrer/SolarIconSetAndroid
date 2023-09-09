package com.chiksmedina.solar.bold.essentionalui

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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.4998f, 9.5605f)
                curveTo(19.5332f, 13.7025f, 16.0815f, 17.5334f, 11.9395f, 17.5f)
                curveTo(7.7975f, 17.4666f, 4.5337f, 13.5815f, 4.5002f, 9.4395f)
                curveTo(4.4668f, 5.2975f, 7.7975f, 1.9668f, 11.9395f, 2.0003f)
                curveTo(16.0815f, 2.0337f, 19.4663f, 5.4185f, 19.4998f, 9.5605f)
                close()
                moveTo(12.5061f, 5.25f)
                curveTo(12.0919f, 5.2467f, 11.7534f, 5.5798f, 11.75f, 5.9939f)
                curveTo(11.7467f, 6.4082f, 12.0797f, 6.7466f, 12.4939f, 6.75f)
                curveTo(13.7281f, 6.7599f, 14.7401f, 7.7719f, 14.75f, 9.0061f)
                curveTo(14.7534f, 9.4202f, 15.0919f, 9.7533f, 15.5061f, 9.75f)
                curveTo(15.9203f, 9.7466f, 16.2533f, 9.4081f, 16.25f, 8.9939f)
                curveTo(16.2334f, 6.9409f, 14.5591f, 5.2666f, 12.5061f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.167f, 18.2144f)
                curveTo(14.4992f, 19.2767f, 13.8108f, 20.3461f, 12.7501f, 20.5616f)
                verticalLineTo(21.9998f)
                curveTo(12.7501f, 22.414f, 12.4143f, 22.7498f, 12.0001f, 22.7498f)
                curveTo(11.5859f, 22.7498f, 11.2501f, 22.414f, 11.2501f, 21.9998f)
                verticalLineTo(20.5616f)
                curveTo(10.1894f, 20.3461f, 9.5009f, 19.2767f, 9.8332f, 18.2144f)
                lineTo(9.84f, 18.193f)
                curveTo(10.5044f, 18.3867f, 11.2043f, 18.4939f, 11.9315f, 18.4998f)
                curveTo(12.7025f, 18.506f, 13.4493f, 18.3973f, 14.1595f, 18.1909f)
                curveTo(14.1622f, 18.1988f, 14.1646f, 18.2066f, 14.167f, 18.2144f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null

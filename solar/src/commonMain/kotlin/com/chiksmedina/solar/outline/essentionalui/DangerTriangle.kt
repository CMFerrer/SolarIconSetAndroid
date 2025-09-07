package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.DangerTriangle: ImageVector
    get() {
        if (_dangerTriangle != null) {
            return _dangerTriangle!!
        }
        _dangerTriangle = Builder(
            name = "DangerTriangle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.25f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.4142f, 12.4142f, 13.75f, 12.0f, 13.75f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.5858f, 11.5858f, 7.25f, 12.0f, 7.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2944f, 4.4764f)
                curveTo(9.3663f, 3.1149f, 10.5018f, 2.25f, 12.0f, 2.25f)
                curveTo(13.4981f, 2.25f, 14.6336f, 3.1149f, 15.7056f, 4.4764f)
                curveTo(16.7598f, 5.8154f, 17.8769f, 7.7962f, 19.3063f, 10.3305f)
                lineTo(19.7418f, 11.1027f)
                curveTo(20.9234f, 13.1976f, 21.8566f, 14.8523f, 22.3468f, 16.1804f)
                curveTo(22.8478f, 17.5376f, 22.9668f, 18.7699f, 22.209f, 19.8569f)
                curveTo(21.4736f, 20.9118f, 20.2466f, 21.3434f, 18.6991f, 21.5471f)
                curveTo(17.1576f, 21.75f, 15.0845f, 21.75f, 12.4248f, 21.75f)
                horizontalLineTo(11.5752f)
                curveTo(8.9155f, 21.75f, 6.8424f, 21.75f, 5.3008f, 21.5471f)
                curveTo(3.7533f, 21.3434f, 2.5264f, 20.9118f, 1.791f, 19.8569f)
                curveTo(1.0332f, 18.7699f, 1.1522f, 17.5376f, 1.6531f, 16.1804f)
                curveTo(2.1433f, 14.8523f, 3.0766f, 13.1977f, 4.2582f, 11.1027f)
                lineTo(4.6936f, 10.3307f)
                curveTo(6.123f, 7.7963f, 7.2402f, 5.8155f, 8.2944f, 4.4764f)
                close()
                moveTo(9.473f, 5.4043f)
                curveTo(8.499f, 6.6415f, 7.437f, 8.5199f, 5.965f, 11.1299f)
                lineTo(5.6013f, 11.7747f)
                curveTo(4.3751f, 13.9488f, 3.5037f, 15.4986f, 3.0603f, 16.6998f)
                curveTo(2.6227f, 17.8855f, 2.6834f, 18.5141f, 3.0215f, 18.9991f)
                curveTo(3.382f, 19.5163f, 4.0587f, 19.8706f, 5.4966f, 20.0599f)
                curveTo(6.9286f, 20.2484f, 8.9026f, 20.25f, 11.6363f, 20.25f)
                horizontalLineTo(12.3636f)
                curveTo(15.0974f, 20.25f, 17.0714f, 20.2484f, 18.5034f, 20.0599f)
                curveTo(19.9412f, 19.8706f, 20.6179f, 19.5163f, 20.9785f, 18.9991f)
                curveTo(21.3166f, 18.5141f, 21.3773f, 17.8855f, 20.9396f, 16.6998f)
                curveTo(20.4963f, 15.4986f, 19.6249f, 13.9488f, 18.3987f, 11.7747f)
                lineTo(18.035f, 11.1299f)
                curveTo(16.5629f, 8.5199f, 15.501f, 6.6415f, 14.527f, 5.4043f)
                curveTo(13.562f, 4.1786f, 12.8126f, 3.75f, 12.0f, 3.75f)
                curveTo(11.1874f, 3.75f, 10.4379f, 4.1786f, 9.473f, 5.4043f)
                close()
            }
        }
            .build()
        return _dangerTriangle!!
    }

private var _dangerTriangle: ImageVector? = null

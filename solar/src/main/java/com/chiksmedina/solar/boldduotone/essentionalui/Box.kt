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

public val EssentionalUiGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4223f, 20.6181f)
                curveTo(10.1779f, 21.5395f, 11.0557f, 22.0001f, 12.0f, 22.0001f)
                verticalLineTo(12.0001f)
                lineTo(2.638f, 7.0728f)
                curveTo(2.6242f, 7.0949f, 2.6107f, 7.1173f, 2.5974f, 7.1399f)
                curveTo(2.0f, 8.1544f, 2.0f, 9.4168f, 2.0f, 11.9416f)
                verticalLineTo(12.0586f)
                curveTo(2.0f, 14.5834f, 2.0f, 15.8459f, 2.5974f, 16.8604f)
                curveTo(3.1948f, 17.8749f, 4.2706f, 18.4395f, 6.4223f, 19.5686f)
                lineTo(8.4223f, 20.6181f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5774f, 4.4315f)
                lineTo(15.5774f, 3.382f)
                curveTo(13.8218f, 2.4607f, 12.944f, 2.0f, 11.9997f, 2.0f)
                curveTo(11.0554f, 2.0f, 10.1776f, 2.4607f, 8.422f, 3.382f)
                lineTo(6.422f, 4.4315f)
                curveTo(4.3182f, 5.5355f, 3.2429f, 6.0998f, 2.6377f, 7.0726f)
                lineTo(11.9997f, 12.0f)
                lineTo(21.3617f, 7.0726f)
                curveTo(20.7564f, 6.0998f, 19.6811f, 5.5355f, 17.5774f, 4.4315f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4026f, 7.1399f)
                curveTo(21.3893f, 7.1173f, 21.3758f, 7.0949f, 21.362f, 7.0728f)
                lineTo(12.0f, 12.0001f)
                verticalLineTo(22.0001f)
                curveTo(12.9443f, 22.0001f, 13.8221f, 21.5395f, 15.5777f, 20.6181f)
                lineTo(17.5777f, 19.5686f)
                curveTo(19.7294f, 18.4395f, 20.8052f, 17.8749f, 21.4026f, 16.8604f)
                curveTo(22.0f, 15.8459f, 22.0f, 14.5834f, 22.0f, 12.0586f)
                verticalLineTo(11.9416f)
                curveTo(22.0f, 9.4168f, 22.0f, 8.1544f, 21.4026f, 7.1399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3233f, 4.4838f)
                curveTo(6.3562f, 4.4666f, 6.3893f, 4.4492f, 6.4226f, 4.4317f)
                lineTo(7.9161f, 3.6479f)
                lineTo(17.0169f, 8.6534f)
                lineTo(21.0406f, 6.6415f)
                curveTo(21.1783f, 6.7975f, 21.298f, 6.9618f, 21.4029f, 7.1399f)
                curveTo(21.5525f, 7.394f, 21.6646f, 7.6635f, 21.7487f, 7.9646f)
                lineTo(17.7503f, 9.9637f)
                verticalLineTo(13.0002f)
                curveTo(17.7503f, 13.4144f, 17.4145f, 13.7502f, 17.0003f, 13.7502f)
                curveTo(16.5861f, 13.7502f, 16.2503f, 13.4144f, 16.2503f, 13.0002f)
                verticalLineTo(10.7137f)
                lineTo(12.7503f, 12.4637f)
                verticalLineTo(21.9042f)
                curveTo(12.4934f, 21.9682f, 12.2492f, 22.0002f, 12.0003f, 22.0002f)
                curveTo(11.7515f, 22.0002f, 11.5072f, 21.9682f, 11.2503f, 21.9042f)
                verticalLineTo(12.4637f)
                lineTo(2.252f, 7.9646f)
                curveTo(2.336f, 7.6635f, 2.4481f, 7.394f, 2.5977f, 7.1399f)
                curveTo(2.7026f, 6.9618f, 2.8223f, 6.7975f, 2.96f, 6.6415f)
                lineTo(12.0003f, 11.1617f)
                lineTo(15.3865f, 9.4686f)
                lineTo(6.3233f, 4.4838f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null

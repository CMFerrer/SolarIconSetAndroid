package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.MagicStick3: ImageVector
    get() {
        if (_magicStick3 != null) {
            return _magicStick3!!
        }
        _magicStick3 = Builder(name = "MagicStick3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 8.9223f)
                lineTo(7.9223f, 3.8445f)
                curveTo(6.7962f, 2.7185f, 4.9706f, 2.7185f, 3.8445f, 3.8445f)
                curveTo(2.7185f, 4.9706f, 2.7185f, 6.7962f, 3.8445f, 7.9223f)
                lineTo(16.0777f, 20.1555f)
                curveTo(17.2038f, 21.2815f, 19.0294f, 21.2815f, 20.1555f, 20.1555f)
                curveTo(21.2815f, 19.0294f, 21.2815f, 17.2038f, 20.1555f, 16.0777f)
                lineTo(17.0777f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                lineTo(10.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1f, 2.3072f)
                curveTo(16.261f, 1.8976f, 16.8385f, 1.8976f, 16.9994f, 2.3072f)
                lineTo(17.4298f, 3.4025f)
                curveTo(17.479f, 3.5275f, 17.5776f, 3.6265f, 17.7022f, 3.6758f)
                lineTo(18.7934f, 4.1078f)
                curveTo(19.2015f, 4.2693f, 19.2015f, 4.849f, 18.7934f, 5.0105f)
                lineTo(17.7022f, 5.4425f)
                curveTo(17.5776f, 5.4918f, 17.479f, 5.5908f, 17.4298f, 5.7159f)
                lineTo(16.9995f, 6.8112f)
                curveTo(16.8385f, 7.2207f, 16.261f, 7.2207f, 16.1f, 6.8112f)
                lineTo(15.6697f, 5.7159f)
                curveTo(15.6205f, 5.5908f, 15.5219f, 5.4918f, 15.3973f, 5.4425f)
                lineTo(14.3061f, 5.0105f)
                curveTo(13.898f, 4.849f, 13.898f, 4.2693f, 14.3061f, 4.1078f)
                lineTo(15.3973f, 3.6758f)
                curveTo(15.5219f, 3.6265f, 15.6205f, 3.5275f, 15.6697f, 3.4025f)
                lineTo(16.1f, 2.3072f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9672f, 9.1294f)
                curveTo(20.1281f, 8.7199f, 20.7057f, 8.7199f, 20.8666f, 9.1294f)
                lineTo(21.0235f, 9.5288f)
                curveTo(21.0727f, 9.6538f, 21.1713f, 9.7528f, 21.2959f, 9.8021f)
                lineTo(21.6937f, 9.9597f)
                curveTo(22.1018f, 10.1212f, 22.1018f, 10.7009f, 21.6937f, 10.8624f)
                lineTo(21.2959f, 11.0199f)
                curveTo(21.1713f, 11.0692f, 21.0727f, 11.1682f, 21.0235f, 11.2932f)
                lineTo(20.8666f, 11.6926f)
                curveTo(20.7057f, 12.1022f, 20.1281f, 12.1022f, 19.9672f, 11.6926f)
                lineTo(19.8103f, 11.2932f)
                curveTo(19.7611f, 11.1682f, 19.6625f, 11.0692f, 19.5379f, 11.0199f)
                lineTo(19.14f, 10.8624f)
                curveTo(18.732f, 10.7009f, 18.732f, 10.1212f, 19.14f, 9.9597f)
                lineTo(19.5379f, 9.8021f)
                curveTo(19.6625f, 9.7528f, 19.7611f, 9.6538f, 19.8103f, 9.5288f)
                lineTo(19.9672f, 9.1294f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1332f, 15.3072f)
                curveTo(5.2941f, 14.8976f, 5.8717f, 14.8976f, 6.0326f, 15.3072f)
                lineTo(6.1895f, 15.7065f)
                curveTo(6.2387f, 15.8316f, 6.3373f, 15.9306f, 6.4619f, 15.9799f)
                lineTo(6.8597f, 16.1374f)
                curveTo(7.2678f, 16.2989f, 7.2678f, 16.8786f, 6.8597f, 17.0401f)
                lineTo(6.4619f, 17.1976f)
                curveTo(6.3373f, 17.2469f, 6.2387f, 17.3459f, 6.1895f, 17.471f)
                lineTo(6.0326f, 17.8703f)
                curveTo(5.8717f, 18.2799f, 5.2941f, 18.2799f, 5.1332f, 17.8703f)
                lineTo(4.9763f, 17.471f)
                curveTo(4.9271f, 17.3459f, 4.8285f, 17.2469f, 4.7039f, 17.1976f)
                lineTo(4.3061f, 17.0401f)
                curveTo(3.898f, 16.8786f, 3.898f, 16.2989f, 4.3061f, 16.1374f)
                lineTo(4.7039f, 15.9799f)
                curveTo(4.8285f, 15.9306f, 4.9271f, 15.8316f, 4.9763f, 15.7065f)
                lineTo(5.1332f, 15.3072f)
                close()
            }
        }
        .build()
        return _magicStick3!!
    }

private var _magicStick3: ImageVector? = null

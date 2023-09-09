package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5925f, 11.2815f)
                curveTo(5.4692f, 9.1582f, 5.4692f, 5.7157f, 7.5925f, 3.5925f)
                curveTo(9.7157f, 1.4692f, 13.1582f, 1.4692f, 15.2815f, 3.5925f)
                lineTo(17.204f, 5.5149f)
                lineTo(17.1085f, 6.0104f)
                lineTo(17.1066f, 6.019f)
                curveTo(17.1044f, 6.0291f, 17.1002f, 6.0474f, 17.0936f, 6.0733f)
                curveTo(17.0805f, 6.1252f, 17.0581f, 6.2078f, 17.0231f, 6.3172f)
                curveTo(16.9532f, 6.536f, 16.8335f, 6.8621f, 16.6391f, 7.2654f)
                curveTo(16.2508f, 8.0711f, 15.5633f, 9.1878f, 14.3752f, 10.3758f)
                curveTo(13.1872f, 11.5639f, 12.0706f, 12.2513f, 11.265f, 12.6395f)
                curveTo(10.8618f, 12.8339f, 10.5358f, 12.9535f, 10.3169f, 13.0234f)
                curveTo(10.2076f, 13.0583f, 10.125f, 13.0808f, 10.0731f, 13.0939f)
                curveTo(10.0472f, 13.1004f, 10.0289f, 13.1046f, 10.0188f, 13.1069f)
                lineTo(10.0103f, 13.1087f)
                lineTo(9.515f, 13.2041f)
                lineTo(7.5925f, 11.2815f)
                close()
                moveTo(13.5303f, 4.4697f)
                curveTo(13.2374f, 4.1768f, 12.7626f, 4.1768f, 12.4697f, 4.4697f)
                curveTo(12.1768f, 4.7626f, 12.1768f, 5.2374f, 12.4697f, 5.5303f)
                lineTo(13.9697f, 7.0303f)
                curveTo(14.2626f, 7.3232f, 14.7374f, 7.3232f, 15.0303f, 7.0303f)
                curveTo(15.3232f, 6.7374f, 15.3232f, 6.2626f, 15.0303f, 5.9697f)
                lineTo(13.5303f, 4.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.452f, 6.7736f)
                lineTo(18.4546f, 6.7655f)
                lineTo(20.4075f, 8.7185f)
                curveTo(22.5308f, 10.8418f, 22.5308f, 14.2843f, 20.4075f, 16.4075f)
                curveTo(18.2843f, 18.5308f, 14.8418f, 18.5308f, 12.7185f, 16.4075f)
                lineTo(10.7657f, 14.4547f)
                lineTo(10.7732f, 14.4523f)
                curveTo(11.0535f, 14.3628f, 11.4451f, 14.2178f, 11.9162f, 13.9908f)
                curveTo(12.8592f, 13.5364f, 14.1178f, 12.7546f, 15.4359f, 11.4365f)
                curveTo(16.754f, 10.1184f, 17.5358f, 8.8598f, 17.9904f, 7.9167f)
                curveTo(18.2174f, 7.4456f, 18.3625f, 7.0539f, 18.452f, 6.7736f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2856f, 10.6477f)
                curveTo(3.3359f, 11.6385f, 2.0f, 13.6632f, 2.0f, 16.0001f)
                curveTo(2.0f, 19.3138f, 4.6863f, 22.0001f, 8.0f, 22.0001f)
                curveTo(10.3368f, 22.0001f, 12.3616f, 20.6642f, 13.3523f, 18.7144f)
                curveTo(12.7425f, 18.3959f, 12.1701f, 17.9805f, 11.6578f, 17.4683f)
                lineTo(6.5318f, 12.3422f)
                curveTo(6.0195f, 11.83f, 5.6042f, 11.2576f, 5.2856f, 10.6477f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null

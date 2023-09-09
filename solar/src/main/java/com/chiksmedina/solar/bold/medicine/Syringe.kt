package com.chiksmedina.solar.bold.medicine

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
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7819f, 3.226f)
                curveTo(17.4807f, 2.9247f, 16.9922f, 2.9247f, 16.691f, 3.226f)
                curveTo(16.3897f, 3.5272f, 16.3897f, 4.0156f, 16.691f, 4.3169f)
                lineTo(17.6415f, 5.2674f)
                lineTo(15.9427f, 6.9662f)
                lineTo(15.0752f, 6.0987f)
                curveTo(14.3f, 5.3235f, 13.9124f, 4.9359f, 13.4717f, 4.7754f)
                curveTo(13.0042f, 4.6053f, 12.4918f, 4.6053f, 12.0244f, 4.7754f)
                curveTo(11.5836f, 4.9359f, 11.196f, 5.3235f, 10.4208f, 6.0987f)
                lineTo(10.3013f, 6.2183f)
                lineTo(17.7817f, 13.6988f)
                lineTo(17.9012f, 13.5792f)
                curveTo(18.6764f, 12.804f, 19.064f, 12.4164f, 19.2244f, 11.9756f)
                curveTo(19.3945f, 11.5082f, 19.3945f, 10.9958f, 19.2244f, 10.5283f)
                curveTo(19.064f, 10.0875f, 18.6764f, 9.6999f, 17.9012f, 8.9247f)
                lineTo(17.0337f, 8.0572f)
                lineTo(18.7324f, 6.3584f)
                lineTo(19.6831f, 7.3091f)
                curveTo(19.9844f, 7.6104f, 20.4728f, 7.6104f, 20.7741f, 7.3091f)
                curveTo(21.0753f, 7.0079f, 21.0753f, 6.5194f, 20.7741f, 6.2182f)
                lineTo(17.7819f, 3.226f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0157f, 10.5039f)
                lineTo(9.2104f, 7.3092f)
                lineTo(16.6907f, 14.7897f)
                lineTo(15.5376f, 15.9429f)
                lineTo(12.5698f, 12.9751f)
                curveTo(12.2686f, 12.6738f, 11.7801f, 12.6738f, 11.4789f, 12.9751f)
                curveTo(11.1776f, 13.2763f, 11.1776f, 13.7648f, 11.4789f, 14.066f)
                lineTo(14.4466f, 17.0339f)
                lineTo(13.8545f, 17.626f)
                lineTo(12.1616f, 15.933f)
                curveTo(11.8603f, 15.6318f, 11.3719f, 15.6318f, 11.0706f, 15.933f)
                curveTo(10.7694f, 16.2343f, 10.7694f, 16.7227f, 11.0706f, 17.024f)
                lineTo(12.6919f, 18.6453f)
                curveTo(10.8462f, 19.8795f, 8.3956f, 19.8278f, 6.6005f, 18.4903f)
                lineTo(4.3169f, 20.7741f)
                curveTo(4.0156f, 21.0753f, 3.5272f, 21.0753f, 3.2259f, 20.7741f)
                curveTo(2.9247f, 20.4728f, 2.9247f, 19.9843f, 3.2259f, 19.6831f)
                lineTo(5.5096f, 17.3993f)
                curveTo(3.9667f, 15.3281f, 4.1354f, 12.3843f, 6.0157f, 10.5039f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null

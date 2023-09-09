package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.Globus: ImageVector
    get() {
        if (_globus != null) {
            return _globus!!
        }
        _globus = Builder(name = "Globus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3873f, 5.0792f)
                curveTo(8.2258f, 4.8117f, 8.0563f, 4.562f, 7.8878f, 4.3346f)
                curveTo(9.0423f, 3.4952f, 10.4633f, 3.0f, 12.0f, 3.0f)
                curveTo(13.32f, 3.0f, 14.5547f, 3.3654f, 15.6084f, 4.0005f)
                curveTo(15.5932f, 4.0896f, 15.5717f, 4.1905f, 15.5419f, 4.3029f)
                curveTo(15.4363f, 4.702f, 15.2701f, 5.083f, 15.1288f, 5.3053f)
                curveTo(15.0801f, 5.382f, 14.8798f, 5.5778f, 14.5164f, 5.8485f)
                curveTo(14.3544f, 5.9692f, 14.1745f, 6.0801f, 13.9603f, 6.2081f)
                lineTo(13.886f, 6.2524f)
                curveTo(13.6985f, 6.3642f, 13.4839f, 6.492f, 13.2771f, 6.6337f)
                curveTo(12.7891f, 6.9681f, 12.2809f, 7.42f, 11.9391f, 8.1508f)
                curveTo(11.6919f, 8.6793f, 11.7089f, 9.194f, 11.8182f, 9.6069f)
                curveTo(11.8539f, 9.7416f, 11.8735f, 9.8773f, 11.8738f, 9.9965f)
                curveTo(11.8739f, 10.0336f, 11.8594f, 10.0928f, 11.7766f, 10.1619f)
                curveTo(11.6876f, 10.2363f, 11.5622f, 10.2812f, 11.4495f, 10.28f)
                curveTo(10.3725f, 10.2678f, 9.523f, 9.3757f, 9.3997f, 7.9527f)
                curveTo(9.306f, 6.8712f, 8.8641f, 5.8688f, 8.3873f, 5.0792f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6517f, 14.5089f)
                curveTo(16.9162f, 14.5062f, 17.1643f, 14.4888f, 17.3969f, 14.4582f)
                curveTo(16.5193f, 15.5195f, 15.3346f, 16.3175f, 13.9791f, 16.7163f)
                curveTo(13.9326f, 16.3349f, 13.9631f, 15.8766f, 14.1879f, 15.4531f)
                curveTo(14.3798f, 15.0914f, 14.8657f, 14.8197f, 15.5216f, 14.6585f)
                curveTo(15.8229f, 14.5844f, 16.1094f, 14.5464f, 16.3222f, 14.5273f)
                curveTo(16.4277f, 14.5179f, 16.5125f, 14.5133f, 16.569f, 14.511f)
                curveTo(16.5972f, 14.5099f, 16.6181f, 14.5094f, 16.6308f, 14.5092f)
                lineTo(16.6429f, 14.509f)
                lineTo(16.6517f, 14.5089f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                curveTo(5.0f, 8.2806f, 5.6199f, 6.706f, 6.6484f, 5.4875f)
                curveTo(6.7496f, 5.6311f, 6.851f, 5.785f, 6.9491f, 5.9475f)
                curveTo(7.3506f, 6.6124f, 7.6624f, 7.3637f, 7.726f, 8.0977f)
                curveTo(7.8967f, 10.0688f, 9.2075f, 11.9347f, 11.4305f, 11.9599f)
                curveTo(12.3923f, 11.9708f, 13.5569f, 11.2479f, 13.5538f, 9.9923f)
                curveTo(13.5531f, 9.7048f, 13.5079f, 9.4247f, 13.4423f, 9.1769f)
                curveTo(13.4107f, 9.0576f, 13.4152f, 8.9602f, 13.4609f, 8.8625f)
                curveTo(13.6314f, 8.4979f, 13.8831f, 8.255f, 14.2266f, 8.0196f)
                curveTo(14.3866f, 7.91f, 14.5529f, 7.8109f, 14.7452f, 7.6961f)
                lineTo(14.8222f, 7.6501f)
                curveTo(15.0375f, 7.5215f, 15.283f, 7.3724f, 15.5202f, 7.1957f)
                curveTo(15.865f, 6.9388f, 16.3107f, 6.5779f, 16.5468f, 6.2062f)
                curveTo(16.7338f, 5.912f, 16.907f, 5.5347f, 17.0412f, 5.1434f)
                curveTo(18.2541f, 6.4021f, 19.0f, 8.1139f, 19.0f, 10.0f)
                curveTo(19.0f, 10.5323f, 18.9406f, 11.0508f, 18.828f, 11.5491f)
                curveTo(18.7606f, 11.7487f, 18.6766f, 11.9352f, 18.5253f, 12.1315f)
                curveTo(18.2881f, 12.4393f, 17.8131f, 12.8167f, 16.6342f, 12.829f)
                lineTo(16.6282f, 12.829f)
                lineTo(16.5995f, 12.8295f)
                curveTo(16.5758f, 12.8299f, 16.5432f, 12.8307f, 16.5027f, 12.8323f)
                curveTo(16.4218f, 12.8355f, 16.3087f, 12.8418f, 16.1721f, 12.8541f)
                curveTo(15.9008f, 12.8784f, 15.5264f, 12.9273f, 15.1206f, 13.027f)
                curveTo(14.3624f, 13.2134f, 13.2498f, 13.6368f, 12.7039f, 14.6656f)
                curveTo(12.2731f, 15.4773f, 12.2246f, 16.3106f, 12.3216f, 16.9927f)
                curveTo(12.215f, 16.9976f, 12.1078f, 17.0f, 12.0f, 17.0f)
                curveTo(8.134f, 17.0f, 5.0f, 13.866f, 5.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0035f, 1.4998f)
                curveTo(18.2797f, 1.1912f, 18.7539f, 1.1649f, 19.0625f, 1.4412f)
                curveTo(21.3246f, 3.4658f, 22.75f, 6.4104f, 22.75f, 9.687f)
                curveTo(22.75f, 15.4384f, 18.3612f, 20.1647f, 12.75f, 20.6996f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 21.25f, 14.75f, 21.5858f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 22.75f, 9.25f, 22.4142f, 9.25f, 22.0f)
                curveTo(9.25f, 21.5858f, 9.5858f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.7415f)
                curveTo(8.1492f, 20.621f, 5.3754f, 19.2236f, 3.4412f, 17.0625f)
                curveTo(3.1649f, 16.7539f, 3.1912f, 16.2797f, 3.4998f, 16.0035f)
                curveTo(3.8085f, 15.7272f, 4.2826f, 15.7535f, 4.5589f, 16.0622f)
                curveTo(6.311f, 18.0198f, 8.8548f, 19.25f, 11.687f, 19.25f)
                curveTo(16.9685f, 19.25f, 21.25f, 14.9685f, 21.25f, 9.687f)
                curveTo(21.25f, 6.8548f, 20.0198f, 4.311f, 18.0622f, 2.5589f)
                curveTo(17.7535f, 2.2826f, 17.7272f, 1.8085f, 18.0035f, 1.4998f)
                close()
            }
        }
        .build()
        return _globus!!
    }

private var _globus: ImageVector? = null

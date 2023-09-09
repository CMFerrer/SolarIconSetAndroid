package com.chiksmedina.solar.outline.users

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
import com.chiksmedina.solar.outline.UsersGroup

public val UsersGroup.UserSpeakRounded: ImageVector
    get() {
        if (_userSpeakRounded != null) {
            return _userSpeakRounded!!
        }
        _userSpeakRounded = Builder(name = "UserSpeakRounded", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3569f, 1.6142f)
                curveTo(18.57f, 1.2591f, 19.0307f, 1.1439f, 19.3859f, 1.357f)
                lineTo(19.0f, 2.0001f)
                curveTo(19.3859f, 1.357f, 19.3855f, 1.3568f, 19.3859f, 1.357f)
                lineTo(19.3873f, 1.3578f)
                lineTo(19.3888f, 1.3588f)
                lineTo(19.3925f, 1.361f)
                lineTo(19.4021f, 1.367f)
                curveTo(19.4095f, 1.3715f, 19.4187f, 1.3774f, 19.4297f, 1.3845f)
                curveTo(19.4517f, 1.3987f, 19.4808f, 1.4181f, 19.516f, 1.4427f)
                curveTo(19.5863f, 1.4919f, 19.6813f, 1.5624f, 19.7926f, 1.6552f)
                curveTo(20.0147f, 1.8403f, 20.3052f, 2.1168f, 20.5945f, 2.4928f)
                curveTo(21.1773f, 3.2506f, 21.75f, 4.4075f, 21.75f, 6.0001f)
                curveTo(21.75f, 7.5928f, 21.1773f, 8.7497f, 20.5945f, 9.5074f)
                curveTo(20.3052f, 9.8834f, 20.0147f, 10.1599f, 19.7926f, 10.345f)
                curveTo(19.6813f, 10.4378f, 19.5863f, 10.5083f, 19.516f, 10.5575f)
                curveTo(19.4808f, 10.5821f, 19.4517f, 10.6015f, 19.4297f, 10.6157f)
                curveTo(19.4187f, 10.6229f, 19.4095f, 10.6287f, 19.4021f, 10.6333f)
                lineTo(19.3925f, 10.6392f)
                lineTo(19.3888f, 10.6414f)
                lineTo(19.3873f, 10.6424f)
                curveTo(19.3869f, 10.6426f, 19.3859f, 10.6432f, 19.0f, 10.0001f)
                lineTo(19.3859f, 10.6432f)
                curveTo(19.0307f, 10.8563f, 18.57f, 10.7412f, 18.3569f, 10.386f)
                curveTo(18.1447f, 10.0323f, 18.258f, 9.574f, 18.6097f, 9.3597f)
                lineTo(18.6152f, 9.3562f)
                curveTo(18.6225f, 9.3514f, 18.6363f, 9.3423f, 18.6558f, 9.3287f)
                curveTo(18.6949f, 9.3013f, 18.7562f, 9.2562f, 18.8324f, 9.1927f)
                curveTo(18.9853f, 9.0653f, 19.1948f, 8.8668f, 19.4055f, 8.5928f)
                curveTo(19.8227f, 8.0506f, 20.25f, 7.2075f, 20.25f, 6.0001f)
                curveTo(20.25f, 4.7928f, 19.8227f, 3.9497f, 19.4055f, 3.4074f)
                curveTo(19.1948f, 3.1335f, 18.9853f, 2.9349f, 18.8324f, 2.8075f)
                curveTo(18.7562f, 2.744f, 18.6949f, 2.6989f, 18.6558f, 2.6716f)
                curveTo(18.6363f, 2.6579f, 18.6225f, 2.6488f, 18.6152f, 2.6441f)
                lineTo(18.6097f, 2.6405f)
                curveTo(18.258f, 2.4262f, 18.1447f, 1.9679f, 18.3569f, 1.6142f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 1.2501f)
                curveTo(7.3766f, 1.2501f, 5.25f, 3.3768f, 5.25f, 6.0001f)
                curveTo(5.25f, 8.6235f, 7.3766f, 10.7501f, 10.0f, 10.7501f)
                curveTo(12.6234f, 10.7501f, 14.75f, 8.6235f, 14.75f, 6.0001f)
                curveTo(14.75f, 3.3768f, 12.6234f, 1.2501f, 10.0f, 1.2501f)
                close()
                moveTo(6.75f, 6.0001f)
                curveTo(6.75f, 4.2052f, 8.2051f, 2.7501f, 10.0f, 2.7501f)
                curveTo(11.7949f, 2.7501f, 13.25f, 4.2052f, 13.25f, 6.0001f)
                curveTo(13.25f, 7.795f, 11.7949f, 9.2501f, 10.0f, 9.2501f)
                curveTo(8.2051f, 9.2501f, 6.75f, 7.795f, 6.75f, 6.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 12.2501f)
                curveTo(7.9607f, 12.2501f, 6.0775f, 12.7209f, 4.6782f, 13.5205f)
                curveTo(3.3f, 14.308f, 2.25f, 15.5102f, 2.25f, 17.0001f)
                curveTo(2.25f, 18.49f, 3.3f, 19.6922f, 4.6782f, 20.4797f)
                curveTo(6.0775f, 21.2794f, 7.9607f, 21.7501f, 10.0f, 21.7501f)
                curveTo(12.0393f, 21.7501f, 13.9225f, 21.2794f, 15.3219f, 20.4797f)
                curveTo(16.7f, 19.6922f, 17.75f, 18.49f, 17.75f, 17.0001f)
                curveTo(17.75f, 15.5102f, 16.7f, 14.308f, 15.3219f, 13.5205f)
                curveTo(13.9225f, 12.7209f, 12.0393f, 12.2501f, 10.0f, 12.2501f)
                close()
                moveTo(3.75f, 17.0001f)
                curveTo(3.75f, 16.2808f, 4.267f, 15.4831f, 5.4224f, 14.8229f)
                curveTo(6.5565f, 14.1748f, 8.1733f, 13.7501f, 10.0f, 13.7501f)
                curveTo(11.8267f, 13.7501f, 13.4435f, 14.1748f, 14.5776f, 14.8229f)
                curveTo(15.733f, 15.4831f, 16.25f, 16.2808f, 16.25f, 17.0001f)
                curveTo(16.25f, 17.7194f, 15.733f, 18.5172f, 14.5776f, 19.1774f)
                curveTo(13.4435f, 19.8254f, 11.8267f, 20.2501f, 10.0f, 20.2501f)
                curveTo(8.1733f, 20.2501f, 6.5565f, 19.8254f, 5.4224f, 19.1774f)
                curveTo(4.267f, 18.5172f, 3.75f, 17.7194f, 3.75f, 17.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3859f, 3.357f)
                curveTo(17.0307f, 3.1439f, 16.57f, 3.2591f, 16.3569f, 3.6142f)
                lineTo(16.6051f, 4.6377f)
                lineTo(16.6129f, 4.6431f)
                curveTo(16.6246f, 4.6512f, 16.6468f, 4.6675f, 16.6761f, 4.6919f)
                curveTo(16.7353f, 4.7412f, 16.8198f, 4.821f, 16.9055f, 4.9324f)
                curveTo(17.0727f, 5.1497f, 17.25f, 5.4928f, 17.25f, 6.0001f)
                curveTo(17.25f, 6.5075f, 17.0727f, 6.8506f, 16.9055f, 7.0678f)
                curveTo(16.8198f, 7.1793f, 16.7353f, 7.259f, 16.6761f, 7.3083f)
                curveTo(16.6468f, 7.3328f, 16.6246f, 7.349f, 16.6129f, 7.3572f)
                lineTo(16.6051f, 7.3625f)
                curveTo(16.257f, 7.5779f, 16.1456f, 8.0338f, 16.3569f, 8.386f)
                curveTo(16.57f, 8.7412f, 17.0307f, 8.8563f, 17.3859f, 8.6432f)
                lineTo(17.0f, 8.0001f)
                curveTo(17.3859f, 8.6432f, 17.3855f, 8.6434f, 17.3859f, 8.6432f)
                lineTo(17.3872f, 8.6424f)
                lineTo(17.3887f, 8.6416f)
                lineTo(17.3918f, 8.6396f)
                lineTo(17.3993f, 8.635f)
                lineTo(17.4185f, 8.6228f)
                curveTo(17.4332f, 8.6133f, 17.4515f, 8.6011f, 17.4731f, 8.586f)
                curveTo(17.516f, 8.5559f, 17.572f, 8.5143f, 17.6364f, 8.4607f)
                curveTo(17.7647f, 8.3537f, 17.9302f, 8.1959f, 18.0945f, 7.9824f)
                curveTo(18.4273f, 7.5497f, 18.75f, 6.8928f, 18.75f, 6.0001f)
                curveTo(18.75f, 5.1075f, 18.4273f, 4.4506f, 18.0945f, 4.0178f)
                curveTo(17.9302f, 3.8043f, 17.7647f, 3.6465f, 17.6364f, 3.5396f)
                curveTo(17.572f, 3.4859f, 17.516f, 3.4443f, 17.4731f, 3.4142f)
                curveTo(17.4515f, 3.3991f, 17.4332f, 3.3869f, 17.4185f, 3.3774f)
                lineTo(17.3993f, 3.3652f)
                lineTo(17.3918f, 3.3606f)
                lineTo(17.3887f, 3.3587f)
                lineTo(17.3872f, 3.3578f)
                curveTo(17.3869f, 3.3576f, 17.3859f, 3.357f, 17.0f, 4.0001f)
                lineTo(17.3859f, 3.357f)
                close()
            }
        }
        .build()
        return _userSpeakRounded!!
    }

private var _userSpeakRounded: ImageVector? = null

package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.CrownMinimalistic: ImageVector
    get() {
        if (_crownMinimalistic != null) {
            return _crownMinimalistic!!
        }
        _crownMinimalistic = Builder(
            name = "CrownMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.7874f, 3.0352f)
                curveTo(11.547f, 3.3921f, 11.2726f, 3.9501f, 10.8609f, 4.7938f)
                lineTo(8.6083f, 9.4098f)
                curveTo(8.4096f, 9.8169f, 8.237f, 10.1707f, 8.0719f, 10.4395f)
                curveTo(7.9028f, 10.7147f, 7.6798f, 11.0082f, 7.3324f, 11.183f)
                curveTo(7.0189f, 11.3408f, 6.6658f, 11.3987f, 6.3163f, 11.3435f)
                curveTo(5.923f, 11.2813f, 5.6245f, 11.0579f, 5.3909f, 10.8419f)
                curveTo(5.1644f, 10.6325f, 4.9108f, 10.3438f, 4.6233f, 10.0164f)
                lineTo(4.5984f, 9.988f)
                curveTo(3.9895f, 9.2949f, 3.5706f, 8.8193f, 3.2461f, 8.516f)
                curveTo(3.0855f, 8.3659f, 2.9799f, 8.2889f, 2.915f, 8.2526f)
                curveTo(2.9147f, 8.2525f, 2.9144f, 8.2523f, 2.9141f, 8.2521f)
                curveTo(2.8804f, 8.2645f, 2.8412f, 8.2888f, 2.8025f, 8.3335f)
                curveTo(2.8025f, 8.3335f, 2.8024f, 8.3335f, 2.8025f, 8.3335f)
                curveTo(2.805f, 8.3349f, 2.7465f, 8.4538f, 2.7501f, 8.9194f)
                curveTo(2.7539f, 9.4067f, 2.8171f, 10.0849f, 2.9085f, 11.056f)
                lineTo(3.1377f, 13.4913f)
                curveTo(3.3282f, 15.5153f, 3.4662f, 16.9699f, 3.6977f, 18.0729f)
                curveTo(3.9265f, 19.1632f, 4.2278f, 19.8071f, 4.6764f, 20.266f)
                curveTo(5.1139f, 20.7136f, 5.676f, 20.9697f, 6.6127f, 21.1067f)
                curveTo(7.58f, 21.2481f, 8.8449f, 21.25f, 10.6401f, 21.25f)
                horizontalLineTo(13.3599f)
                curveTo(15.155f, 21.25f, 16.4199f, 21.2481f, 17.3872f, 21.1067f)
                curveTo(18.324f, 20.9697f, 18.886f, 20.7136f, 19.3236f, 20.266f)
                curveTo(19.7722f, 19.8071f, 20.0735f, 19.1632f, 20.3023f, 18.0729f)
                curveTo(20.5337f, 16.9699f, 20.6718f, 15.5153f, 20.8623f, 13.4913f)
                lineTo(21.0915f, 11.056f)
                curveTo(21.1829f, 10.0849f, 21.246f, 9.4067f, 21.2498f, 8.9194f)
                curveTo(21.2534f, 8.4538f, 21.1947f, 8.3348f, 21.1973f, 8.3335f)
                curveTo(21.1977f, 8.3333f, 21.1995f, 8.3358f, 21.2032f, 8.3403f)
                curveTo(21.1627f, 8.2913f, 21.1212f, 8.2651f, 21.0858f, 8.2521f)
                curveTo(21.0855f, 8.2523f, 21.0852f, 8.2525f, 21.0849f, 8.2526f)
                curveTo(21.02f, 8.2889f, 20.9145f, 8.3659f, 20.7539f, 8.516f)
                curveTo(20.4294f, 8.8193f, 20.0104f, 9.2949f, 19.4016f, 9.988f)
                lineTo(19.3767f, 10.0164f)
                curveTo(19.0891f, 10.3438f, 18.8356f, 10.6325f, 18.6091f, 10.8419f)
                curveTo(18.3754f, 11.0579f, 18.077f, 11.2813f, 17.6837f, 11.3435f)
                curveTo(17.3341f, 11.3987f, 16.981f, 11.3408f, 16.6676f, 11.183f)
                curveTo(16.3202f, 11.0082f, 16.0972f, 10.7147f, 15.9281f, 10.4395f)
                curveTo(15.7629f, 10.1707f, 15.5903f, 9.8169f, 15.3916f, 9.4097f)
                lineTo(13.139f, 4.7938f)
                curveTo(12.7273f, 3.9501f, 12.453f, 3.3921f, 12.2126f, 3.0352f)
                curveTo(12.1108f, 2.8841f, 12.0408f, 2.8086f, 12.0f, 2.7722f)
                curveTo(11.9591f, 2.8086f, 11.8892f, 2.8841f, 11.7874f, 3.0352f)
                close()
                moveTo(12.044f, 2.741f)
                curveTo(12.044f, 2.7414f, 12.0409f, 2.7433f, 12.0348f, 2.7453f)
                curveTo(12.041f, 2.7415f, 12.0441f, 2.7405f, 12.044f, 2.741f)
                close()
                moveTo(11.9652f, 2.7453f)
                curveTo(11.9591f, 2.7433f, 11.9559f, 2.7414f, 11.9559f, 2.741f)
                curveTo(11.9559f, 2.7405f, 11.9589f, 2.7415f, 11.9652f, 2.7453f)
                close()
                moveTo(10.5433f, 2.1972f)
                curveTo(10.845f, 1.7494f, 11.2936f, 1.25f, 12.0f, 1.25f)
                curveTo(12.7063f, 1.25f, 13.1549f, 1.7493f, 13.4566f, 2.1972f)
                curveTo(13.7628f, 2.6517f, 14.0823f, 3.3065f, 14.4611f, 4.0828f)
                lineTo(16.7239f, 8.7196f)
                curveTo(16.943f, 9.1684f, 17.0839f, 9.4552f, 17.2061f, 9.6542f)
                curveTo(17.291f, 9.7923f, 17.3373f, 9.8368f, 17.3482f, 9.8462f)
                curveTo(17.3794f, 9.8607f, 17.4086f, 9.8654f, 17.4354f, 9.8635f)
                curveTo(17.4528f, 9.8539f, 17.5014f, 9.8232f, 17.5907f, 9.7406f)
                curveTo(17.7528f, 9.5907f, 17.9546f, 9.3624f, 18.2746f, 8.9981f)
                lineTo(18.3037f, 8.965f)
                curveTo(18.8764f, 8.313f, 19.3442f, 7.7804f, 19.7295f, 7.4202f)
                curveTo(19.9271f, 7.2355f, 20.1348f, 7.0653f, 20.353f, 6.9433f)
                curveTo(20.5749f, 6.8192f, 20.8536f, 6.7196f, 21.1716f, 6.7475f)
                curveTo(21.6447f, 6.789f, 22.0644f, 7.0283f, 22.3588f, 7.3839f)
                curveTo(22.7138f, 7.8129f, 22.7538f, 8.4126f, 22.7498f, 8.931f)
                curveTo(22.7454f, 9.4911f, 22.6754f, 10.2344f, 22.5885f, 11.158f)
                lineTo(22.3512f, 13.6798f)
                curveTo(22.1662f, 15.6455f, 22.0213f, 17.185f, 21.7703f, 18.381f)
                curveTo(21.5146f, 19.5995f, 21.1302f, 20.5636f, 20.3962f, 21.3145f)
                curveTo(19.6511f, 22.0767f, 18.7357f, 22.4254f, 17.6043f, 22.5909f)
                curveTo(16.516f, 22.75f, 15.1413f, 22.75f, 13.4193f, 22.75f)
                horizontalLineTo(10.5806f)
                curveTo(8.8586f, 22.75f, 7.484f, 22.75f, 6.3957f, 22.5909f)
                curveTo(5.2643f, 22.4254f, 4.3488f, 22.0767f, 3.6037f, 21.3145f)
                curveTo(2.8697f, 20.5636f, 2.4853f, 19.5995f, 2.2297f, 18.381f)
                curveTo(1.9787f, 17.185f, 1.8338f, 15.6455f, 1.6488f, 13.6798f)
                lineTo(1.4115f, 11.158f)
                curveTo(1.3245f, 10.2344f, 1.2545f, 9.4911f, 1.2502f, 8.931f)
                curveTo(1.2462f, 8.4126f, 1.2861f, 7.8129f, 1.6412f, 7.3839f)
                curveTo(1.9355f, 7.0283f, 2.3553f, 6.789f, 2.8283f, 6.7475f)
                curveTo(3.1463f, 6.7196f, 3.425f, 6.8192f, 3.6469f, 6.9433f)
                curveTo(3.8652f, 7.0653f, 4.0728f, 7.2355f, 4.2704f, 7.4202f)
                curveTo(4.6557f, 7.7804f, 5.1235f, 8.313f, 5.6962f, 8.965f)
                lineTo(5.7253f, 8.9981f)
                curveTo(6.0454f, 9.3624f, 6.2471f, 9.5907f, 6.4092f, 9.7406f)
                curveTo(6.4986f, 9.8232f, 6.5472f, 9.8539f, 6.5645f, 9.8635f)
                curveTo(6.5914f, 9.8654f, 6.6205f, 9.8607f, 6.6518f, 9.8462f)
                curveTo(6.6626f, 9.8368f, 6.709f, 9.7923f, 6.7938f, 9.6542f)
                curveTo(6.9161f, 9.4552f, 7.057f, 9.1684f, 7.276f, 8.7196f)
                lineTo(9.5388f, 4.0828f)
                curveTo(9.9176f, 3.3065f, 10.2371f, 2.6517f, 10.5433f, 2.1972f)
                close()
            }
        }
            .build()
        return _crownMinimalistic!!
    }

private var _crownMinimalistic: ImageVector? = null

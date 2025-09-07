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

val EssentionalUiGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(
            name = "Confetti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6014f, 2.4004f)
                curveTo(15.3816f, 2.1807f, 15.1051f, 2.1903f, 14.9534f, 2.2104f)
                curveTo(14.8101f, 2.2295f, 14.6383f, 2.2783f, 14.4747f, 2.3249f)
                lineTo(14.3487f, 2.3607f)
                lineTo(14.2463f, 2.2961f)
                curveTo(14.1077f, 2.2085f, 13.9589f, 2.1145f, 13.8264f, 2.0569f)
                curveTo(13.6771f, 1.992f, 13.425f, 1.9182f, 13.1601f, 2.0574f)
                curveTo(12.9002f, 2.1939f, 12.8147f, 2.4384f, 12.7794f, 2.594f)
                curveTo(12.7472f, 2.7355f, 12.7334f, 2.9125f, 12.7203f, 3.0809f)
                lineTo(12.7104f, 3.2084f)
                lineTo(12.7095f, 3.219f)
                lineTo(12.598f, 3.3109f)
                curveTo(12.4647f, 3.4205f, 12.3264f, 3.5343f, 12.2282f, 3.6416f)
                curveTo(12.1243f, 3.7552f, 11.9641f, 3.9687f, 12.0048f, 4.2659f)
                curveTo(12.0469f, 4.5733f, 12.2695f, 4.7327f, 12.4086f, 4.8099f)
                curveTo(12.5345f, 4.8797f, 12.7003f, 4.9409f, 12.8548f, 4.9979f)
                lineTo(12.9637f, 5.0381f)
                lineTo(13.0039f, 5.147f)
                curveTo(13.0609f, 5.3015f, 13.1221f, 5.4673f, 13.1919f, 5.5932f)
                curveTo(13.2691f, 5.7323f, 13.4285f, 5.9549f, 13.7359f, 5.997f)
                curveTo(14.0331f, 6.0377f, 14.2466f, 5.8775f, 14.3602f, 5.7736f)
                curveTo(14.4674f, 5.6754f, 14.5813f, 5.5371f, 14.6909f, 5.4038f)
                lineTo(14.7828f, 5.2922f)
                lineTo(14.7934f, 5.2914f)
                lineTo(14.9209f, 5.2815f)
                curveTo(15.0892f, 5.2684f, 15.2663f, 5.2546f, 15.4078f, 5.2224f)
                curveTo(15.5634f, 5.1871f, 15.8079f, 5.1016f, 15.9444f, 4.8417f)
                curveTo(16.0836f, 4.5768f, 16.0098f, 4.3247f, 15.9449f, 4.1754f)
                curveTo(15.8873f, 4.0429f, 15.7933f, 3.8941f, 15.7058f, 3.7555f)
                lineTo(15.6411f, 3.653f)
                lineTo(15.6769f, 3.527f)
                curveTo(15.7235f, 3.3634f, 15.7723f, 3.1917f, 15.7914f, 3.0484f)
                curveTo(15.8115f, 2.8967f, 15.8211f, 2.6202f, 15.6014f, 2.4004f)
                close()
                moveTo(14.7018f, 3.2999f)
                lineTo(14.6239f, 3.3221f)
                lineTo(14.6033f, 3.3281f)
                curveTo(14.5279f, 3.3505f, 14.3708f, 3.3972f, 14.2071f, 3.3748f)
                curveTo(14.0395f, 3.3519f, 13.9008f, 3.2618f, 13.8365f, 3.2201f)
                lineTo(13.8193f, 3.2091f)
                lineTo(13.7184f, 3.1454f)
                lineTo(13.7074f, 3.2862f)
                lineTo(13.7058f, 3.3077f)
                curveTo(13.7005f, 3.387f, 13.6898f, 3.547f, 13.6134f, 3.6923f)
                curveTo(13.5381f, 3.8357f, 13.4138f, 3.9358f, 13.351f, 3.9865f)
                lineTo(13.3337f, 4.0005f)
                lineTo(13.2429f, 4.0752f)
                lineTo(13.3204f, 4.1038f)
                lineTo(13.3395f, 4.1107f)
                curveTo(13.4112f, 4.136f, 13.5694f, 4.1921f, 13.6895f, 4.3123f)
                curveTo(13.8097f, 4.4324f, 13.8658f, 4.5906f, 13.8911f, 4.6623f)
                lineTo(13.898f, 4.6814f)
                lineTo(13.9266f, 4.7589f)
                lineTo(14.0013f, 4.6681f)
                lineTo(14.0153f, 4.6508f)
                curveTo(14.066f, 4.588f, 14.1661f, 4.4637f, 14.3095f, 4.3884f)
                curveTo(14.4548f, 4.312f, 14.6148f, 4.3013f, 14.694f, 4.2959f)
                lineTo(14.7156f, 4.2944f)
                lineTo(14.8564f, 4.2834f)
                lineTo(14.7927f, 4.1824f)
                lineTo(14.7817f, 4.1653f)
                curveTo(14.74f, 4.101f, 14.6499f, 3.9623f, 14.627f, 3.7947f)
                curveTo(14.6046f, 3.631f, 14.6513f, 3.4739f, 14.6737f, 3.3985f)
                lineTo(14.6797f, 3.3779f)
                lineTo(14.7018f, 3.2999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.435f, 3.1704f)
                curveTo(10.6511f, 2.817f, 10.5397f, 2.3554f, 10.1863f, 2.1393f)
                curveTo(9.8329f, 1.9233f, 9.3713f, 2.0346f, 9.1552f, 2.388f)
                curveTo(8.637f, 3.2357f, 8.7669f, 4.328f, 9.4694f, 5.0305f)
                lineTo(9.5673f, 5.1284f)
                curveTo(9.7649f, 5.3261f, 9.8378f, 5.6164f, 9.757f, 5.884f)
                curveTo(9.6371f, 6.2805f, 9.8614f, 6.6991f, 10.2579f, 6.819f)
                curveTo(10.6544f, 6.9388f, 11.0729f, 6.7145f, 11.1928f, 6.318f)
                curveTo(11.4337f, 5.5212f, 11.2166f, 4.6564f, 10.6279f, 4.0677f)
                lineTo(10.5301f, 3.9699f)
                curveTo(10.3175f, 3.7573f, 10.2782f, 3.4269f, 10.435f, 3.1704f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.6862f, 3.9408f)
                curveTo(7.4767f, 3.7313f, 7.1371f, 3.7313f, 6.9276f, 3.9408f)
                curveTo(6.7181f, 4.1503f, 6.7181f, 4.4899f, 6.9276f, 4.6994f)
                curveTo(7.1371f, 4.9088f, 7.4767f, 4.9088f, 7.6862f, 4.6994f)
                curveTo(7.8956f, 4.4899f, 7.8956f, 4.1503f, 7.6862f, 3.9408f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.2774f, 5.6041f)
                curveTo(18.3587f, 5.198f, 18.0953f, 4.8029f, 17.6891f, 4.7216f)
                curveTo(17.2829f, 4.6404f, 16.8878f, 4.9038f, 16.8066f, 5.31f)
                lineTo(16.6626f, 6.0299f)
                curveTo(16.57f, 6.4929f, 16.2364f, 6.8708f, 15.7885f, 7.0201f)
                curveTo(14.8299f, 7.3396f, 14.116f, 8.1483f, 13.9179f, 9.1391f)
                lineTo(13.7739f, 9.859f)
                curveTo(13.6926f, 10.2652f, 13.9561f, 10.6603f, 14.3622f, 10.7415f)
                curveTo(14.7684f, 10.8228f, 15.1635f, 10.5594f, 15.2447f, 10.1532f)
                lineTo(15.3887f, 9.4333f)
                curveTo(15.4813f, 8.9703f, 15.8149f, 8.5924f, 16.2628f, 8.4431f)
                curveTo(17.2214f, 8.1236f, 17.9353f, 7.3149f, 18.1335f, 6.3241f)
                lineTo(18.2774f, 5.6041f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.5235f, 8.8423f)
                curveTo(22.7793f, 9.3962f, 22.6067f, 10.025f, 22.1395f, 10.4922f)
                curveTo(21.8687f, 10.7631f, 21.5056f, 10.8858f, 21.1824f, 10.9432f)
                curveTo(20.8517f, 11.0021f, 20.5021f, 11.0032f, 20.1959f, 10.9836f)
                curveTo(19.8866f, 10.9638f, 19.603f, 10.9215f, 19.398f, 10.8847f)
                curveTo(19.295f, 10.8662f, 19.2104f, 10.8488f, 19.1509f, 10.8358f)
                lineTo(19.1045f, 10.8255f)
                lineTo(19.0807f, 10.8201f)
                lineTo(19.061f, 10.8154f)
                lineTo(19.0552f, 10.814f)
                lineTo(19.0533f, 10.8135f)
                curveTo(19.0532f, 10.8135f, 19.0522f, 10.8133f, 19.1723f, 10.3279f)
                lineTo(19.0522f, 10.8133f)
                curveTo(18.8721f, 10.7687f, 18.7315f, 10.6279f, 18.6869f, 10.4478f)
                lineTo(18.6862f, 10.4451f)
                lineTo(18.6848f, 10.4393f)
                lineTo(18.6802f, 10.4195f)
                curveTo(18.6763f, 10.4028f, 18.6709f, 10.3792f, 18.6644f, 10.3494f)
                curveTo(18.6514f, 10.2898f, 18.634f, 10.2052f, 18.6155f, 10.1022f)
                curveTo(18.5787f, 9.8972f, 18.5364f, 9.6136f, 18.5166f, 9.3044f)
                curveTo(18.497f, 8.9981f, 18.4982f, 8.6486f, 18.557f, 8.3179f)
                curveTo(18.6145f, 7.9946f, 18.7372f, 7.6316f, 19.0081f, 7.3607f)
                curveTo(19.4752f, 6.8936f, 20.104f, 6.7209f, 20.6579f, 6.9767f)
                curveTo(21.0781f, 7.1708f, 21.3514f, 7.5636f, 21.4543f, 8.0459f)
                curveTo(21.9366f, 8.1488f, 22.3294f, 8.4221f, 22.5235f, 8.8423f)
                close()
                moveTo(19.596f, 9.9042f)
                curveTo(19.774f, 9.9356f, 20.0094f, 9.9696f, 20.2597f, 9.9856f)
                curveTo(20.5231f, 10.0025f, 20.7851f, 9.9982f, 21.0073f, 9.9587f)
                curveTo(21.2369f, 9.9178f, 21.3682f, 9.8493f, 21.4324f, 9.7851f)
                curveTo(21.6752f, 9.5423f, 21.6566f, 9.3503f, 21.6156f, 9.2616f)
                curveTo(21.5711f, 9.1652f, 21.4115f, 8.9988f, 21.0017f, 8.9999f)
                curveTo(20.8686f, 9.0002f, 20.7409f, 8.9475f, 20.6468f, 8.8534f)
                curveTo(20.5527f, 8.7593f, 20.5f, 8.6316f, 20.5003f, 8.4986f)
                curveTo(20.5014f, 8.0887f, 20.335f, 7.9291f, 20.2386f, 7.8846f)
                curveTo(20.1499f, 7.8436f, 19.9579f, 7.825f, 19.7152f, 8.0678f)
                curveTo(19.6509f, 8.1321f, 19.5824f, 8.2633f, 19.5415f, 8.493f)
                curveTo(19.502f, 8.7151f, 19.4977f, 8.9771f, 19.5146f, 9.2405f)
                curveTo(19.5306f, 9.4908f, 19.5646f, 9.7262f, 19.596f, 9.9042f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.3308f, 13.7297f)
                curveTo(20.6262f, 13.4678f, 21.0468f, 13.4014f, 21.4085f, 13.5595f)
                lineTo(21.7f, 13.687f)
                curveTo(22.0795f, 13.8529f, 22.5217f, 13.6798f, 22.6877f, 13.3002f)
                curveTo(22.8536f, 12.9207f, 22.6805f, 12.4785f, 22.3009f, 12.3126f)
                lineTo(22.0094f, 12.1851f)
                curveTo(21.112f, 11.7928f, 20.0684f, 11.9576f, 19.3356f, 12.6074f)
                curveTo(19.0094f, 12.8966f, 18.5347f, 12.9447f, 18.1572f, 12.7267f)
                lineTo(17.9443f, 12.6039f)
                curveTo(17.5856f, 12.3967f, 17.1269f, 12.5197f, 16.9198f, 12.8784f)
                curveTo(16.7127f, 13.2371f, 16.8356f, 13.6958f, 17.1943f, 13.9029f)
                lineTo(17.4072f, 14.0258f)
                curveTo(18.3439f, 14.5666f, 19.5215f, 14.4473f, 20.3308f, 13.7297f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0582f, 15.3134f)
                curveTo(19.2677f, 15.1039f, 19.6073f, 15.1039f, 19.8168f, 15.3134f)
                curveTo(20.0263f, 15.5229f, 20.0263f, 15.8625f, 19.8168f, 16.0719f)
                curveTo(19.6073f, 16.2814f, 19.2677f, 16.2814f, 19.0582f, 16.0719f)
                curveTo(18.8488f, 15.8625f, 18.8488f, 15.5229f, 19.0582f, 15.3134f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.9157f, 7.1571f)
                curveTo(12.7062f, 6.9477f, 12.3666f, 6.9477f, 12.1571f, 7.1571f)
                curveTo(11.9476f, 7.3666f, 11.9476f, 7.7062f, 12.1571f, 7.9157f)
                curveTo(12.3666f, 8.1251f, 12.7062f, 8.1251f, 12.9157f, 7.9157f)
                curveTo(13.1251f, 7.7062f, 13.1251f, 7.3666f, 12.9157f, 7.1571f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1571f, 10.1571f)
                curveTo(17.3666f, 9.9477f, 17.7062f, 9.9477f, 17.9157f, 10.1571f)
                curveTo(18.1251f, 10.3666f, 18.1251f, 10.7062f, 17.9157f, 10.9157f)
                curveTo(17.7062f, 11.1252f, 17.3666f, 11.1252f, 17.1571f, 10.9157f)
                curveTo(16.9476f, 10.7062f, 16.9476f, 10.3666f, 17.1571f, 10.1571f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.6388f, 6.885f)
                curveTo(10.2252f, 7.3197f, 10.8997f, 7.9943f, 11.7184f, 8.813f)
                lineTo(15.1861f, 12.2807f)
                curveTo(16.0048f, 13.0993f, 16.6794f, 13.7739f, 17.1141f, 14.3602f)
                curveTo(17.5632f, 14.966f, 17.8797f, 15.6392f, 17.6967f, 16.4145f)
                curveTo(17.5137f, 17.1898f, 16.9295f, 17.6504f, 16.2569f, 17.9914f)
                curveTo(15.6059f, 18.3214f, 14.7007f, 18.6231f, 13.6024f, 18.9892f)
                lineTo(8.4122f, 20.7193f)
                curveTo(7.0823f, 21.1626f, 6.0031f, 21.5223f, 5.1663f, 21.6712f)
                curveTo(4.3219f, 21.8214f, 3.465f, 21.8063f, 2.8289f, 21.1702f)
                curveTo(2.1928f, 20.534f, 2.1777f, 19.6772f, 2.3279f, 18.8328f)
                curveTo(2.4767f, 17.9959f, 2.8365f, 16.9167f, 3.2799f, 15.5868f)
                lineTo(5.0099f, 10.3967f)
                curveTo(5.376f, 9.2983f, 5.6776f, 8.3932f, 6.0077f, 7.7422f)
                curveTo(6.3486f, 7.0696f, 6.8092f, 6.4854f, 7.5845f, 6.3024f)
                curveTo(8.3598f, 6.1194f, 9.0331f, 6.4359f, 9.6388f, 6.885f)
                close()
                moveTo(8.7455f, 8.0899f)
                curveTo(8.728f, 8.077f, 8.7109f, 8.0645f, 8.6941f, 8.0524f)
                curveTo(8.6826f, 8.1147f, 8.6704f, 8.1816f, 8.6575f, 8.2529f)
                curveTo(8.5725f, 8.7245f, 8.4612f, 9.384f, 8.3559f, 10.1344f)
                curveTo(8.1432f, 11.6497f, 7.9634f, 13.4816f, 8.0555f, 14.8854f)
                curveTo(8.1112f, 15.7353f, 8.2932f, 16.8348f, 8.467f, 17.7418f)
                curveTo(8.553f, 18.1911f, 8.6355f, 18.5852f, 8.6964f, 18.8669f)
                curveTo(8.7094f, 18.9271f, 8.7214f, 18.9821f, 8.7323f, 19.0314f)
                lineTo(11.367f, 18.1532f)
                curveTo(11.2977f, 17.9477f, 11.2147f, 17.683f, 11.1319f, 17.3749f)
                curveTo(10.9329f, 16.6351f, 10.727f, 15.6175f, 10.727f, 14.5554f)
                curveTo(10.727f, 13.4401f, 10.932f, 12.4229f, 11.1328f, 11.6907f)
                curveTo(11.2338f, 11.3228f, 11.3351f, 11.0219f, 11.4122f, 10.8108f)
                curveTo(11.4301f, 10.7615f, 11.4468f, 10.7171f, 11.4619f, 10.6778f)
                lineTo(10.7021f, 9.918f)
                curveTo(9.8279f, 9.0438f, 9.2316f, 8.4503f, 8.7455f, 8.0899f)
                close()
                moveTo(6.4131f, 10.9305f)
                curveTo(6.622f, 10.3036f, 6.7959f, 9.7839f, 6.9542f, 9.3535f)
                curveTo(6.9262f, 9.5371f, 6.8981f, 9.7284f, 6.8704f, 9.9259f)
                curveTo(6.6553f, 11.4592f, 6.456f, 13.4181f, 6.5587f, 14.9836f)
                curveTo(6.6208f, 15.9308f, 6.8179f, 17.1059f, 6.9937f, 18.024f)
                curveTo(7.0825f, 18.4874f, 7.1675f, 18.8936f, 7.2303f, 19.184f)
                curveTo(7.2593f, 19.3183f, 7.2837f, 19.428f, 7.3016f, 19.5076f)
                curveTo(6.2607f, 19.8512f, 5.494f, 20.0894f, 4.9036f, 20.1944f)
                curveTo(4.1828f, 20.3226f, 3.9834f, 20.2033f, 3.8896f, 20.1095f)
                curveTo(3.7958f, 20.0157f, 3.6765f, 19.8163f, 3.8047f, 19.0955f)
                curveTo(3.9319f, 18.3802f, 4.2546f, 17.4059f, 4.7236f, 15.999f)
                lineTo(6.4131f, 10.9305f)
                close()
                moveTo(13.0686f, 17.586f)
                lineTo(12.79f, 17.6788f)
                curveTo(12.7291f, 17.4983f, 12.6548f, 17.2619f, 12.5804f, 16.9853f)
                curveTo(12.5265f, 16.7851f, 12.4733f, 16.5663f, 12.4251f, 16.3343f)
                curveTo(12.3122f, 15.7904f, 12.227f, 15.174f, 12.227f, 14.5554f)
                curveTo(12.227f, 13.6153f, 12.4012f, 12.7371f, 12.5794f, 12.0877f)
                curveTo(12.6012f, 12.0081f, 12.623f, 11.9322f, 12.6445f, 11.8604f)
                lineTo(14.0811f, 13.297f)
                curveTo(14.9552f, 14.1712f, 15.5487f, 14.7675f, 15.9091f, 15.2536f)
                curveTo(16.263f, 15.7308f, 16.2677f, 15.9389f, 16.2368f, 16.0699f)
                curveTo(16.2059f, 16.2009f, 16.1086f, 16.3849f, 15.5787f, 16.6535f)
                curveTo(15.0389f, 16.9271f, 14.2414f, 17.195f, 13.0686f, 17.586f)
                close()
            }
        }
            .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null

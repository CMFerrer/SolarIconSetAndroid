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

val EssentionalUiGroup.Body: ImageVector
    get() {
        if (_body != null) {
            return _body!!
        }
        _body = Builder(
            name = "Body", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.6773f, 1.5043f)
                curveTo(7.3267f, 1.1681f, 8.0928f, 1.1724f, 8.7355f, 1.475f)
                lineTo(8.9995f, 1.5993f)
                curveTo(9.1822f, 1.6853f, 9.3434f, 1.8173f, 9.4635f, 1.9869f)
                curveTo(10.6624f, 3.6803f, 13.3376f, 3.6803f, 14.5365f, 1.9869f)
                lineTo(15.1487f, 2.4202f)
                lineTo(15.1883f, 2.4483f)
                moveTo(15.1487f, 2.4202f)
                lineTo(14.5365f, 1.9869f)
                curveTo(14.5365f, 1.9869f, 14.5365f, 1.9869f, 14.5365f, 1.9869f)
                curveTo(14.6566f, 1.8173f, 14.8178f, 1.6853f, 15.0005f, 1.5993f)
                lineTo(15.2645f, 1.475f)
                curveTo(15.9072f, 1.1724f, 16.6733f, 1.1681f, 17.3227f, 1.5043f)
                curveTo(17.9087f, 1.8076f, 18.7808f, 2.2819f, 19.4014f, 2.7271f)
                curveTo(19.5702f, 2.8482f, 19.7413f, 2.982f, 19.9099f, 3.1215f)
                lineTo(19.9544f, 3.1582f)
                curveTo(20.4404f, 3.5601f, 20.8753f, 3.9197f, 21.1786f, 4.2712f)
                curveTo(21.5195f, 4.6663f, 21.7537f, 5.1164f, 21.75f, 5.6953f)
                curveTo(21.7461f, 6.2947f, 21.4721f, 6.7572f, 21.1071f, 7.1576f)
                curveTo(20.772f, 7.5252f, 20.2909f, 7.9135f, 19.7373f, 8.3602f)
                lineTo(19.4863f, 8.5628f)
                curveTo(18.8776f, 9.0541f, 18.7702f, 9.1623f, 18.7137f, 9.2779f)
                curveTo(18.6604f, 9.387f, 18.6428f, 9.5206f, 18.6428f, 10.2771f)
                verticalLineTo(15.5403f)
                curveTo(18.6428f, 15.5757f, 18.6428f, 15.6107f, 18.6428f, 15.6453f)
                curveTo(18.6434f, 16.2432f, 18.6438f, 16.724f, 18.4748f, 17.1777f)
                curveTo(18.307f, 17.6282f, 17.992f, 17.9983f, 17.5949f, 18.4648f)
                curveTo(17.5719f, 18.4918f, 17.5487f, 18.5191f, 17.5252f, 18.5468f)
                lineTo(15.1437f, 21.3497f)
                curveTo(15.1178f, 21.3803f, 15.092f, 21.4107f, 15.0665f, 21.4408f)
                curveTo(14.6701f, 21.9088f, 14.3274f, 22.3134f, 13.8401f, 22.5339f)
                curveTo(13.3588f, 22.7517f, 12.8216f, 22.751f, 12.186f, 22.7501f)
                curveTo(12.1452f, 22.7501f, 12.1039f, 22.75f, 12.0623f, 22.75f)
                horizontalLineTo(11.9377f)
                curveTo(11.8961f, 22.75f, 11.8548f, 22.7501f, 11.814f, 22.7501f)
                curveTo(11.1784f, 22.751f, 10.6412f, 22.7517f, 10.1599f, 22.5339f)
                curveTo(9.6726f, 22.3134f, 9.3299f, 21.9088f, 8.9334f, 21.4408f)
                curveTo(8.908f, 21.4107f, 8.8822f, 21.3803f, 8.8563f, 21.3497f)
                lineTo(6.4748f, 18.5468f)
                curveTo(6.4513f, 18.5191f, 6.4281f, 18.4918f, 6.4051f, 18.4648f)
                curveTo(6.008f, 17.9983f, 5.693f, 17.6282f, 5.5252f, 17.1777f)
                curveTo(5.3562f, 16.724f, 5.3566f, 16.2432f, 5.3572f, 15.6453f)
                curveTo(5.3572f, 15.6107f, 5.3572f, 15.5757f, 5.3572f, 15.5403f)
                verticalLineTo(10.2771f)
                curveTo(5.3572f, 9.5206f, 5.3396f, 9.387f, 5.2863f, 9.2779f)
                curveTo(5.2298f, 9.1623f, 5.1224f, 9.0541f, 4.5137f, 8.5628f)
                lineTo(4.3064f, 8.3955f)
                curveTo(4.2918f, 8.3837f, 4.2772f, 8.3719f, 4.2626f, 8.3602f)
                curveTo(3.7091f, 7.9135f, 3.228f, 7.5252f, 2.8929f, 7.1576f)
                curveTo(2.5279f, 6.7572f, 2.2539f, 6.2947f, 2.25f, 5.6953f)
                curveTo(2.2463f, 5.1164f, 2.4805f, 4.6663f, 2.8214f, 4.2712f)
                curveTo(3.1247f, 3.9197f, 3.5597f, 3.5601f, 4.0457f, 3.1582f)
                curveTo(4.0604f, 3.146f, 4.0752f, 3.1337f, 4.0901f, 3.1215f)
                curveTo(4.2587f, 2.982f, 4.4298f, 2.8482f, 4.5986f, 2.7271f)
                curveTo(5.2192f, 2.2819f, 6.0913f, 1.8076f, 6.6773f, 1.5043f)
                moveTo(8.0966f, 2.8321f)
                curveTo(7.8566f, 2.7191f, 7.5824f, 2.7248f, 7.367f, 2.8363f)
                curveTo(6.7852f, 3.1375f, 5.9978f, 3.5694f, 5.473f, 3.9459f)
                curveTo(5.3383f, 4.0425f, 5.1949f, 4.1543f, 5.0461f, 4.2773f)
                curveTo(4.5017f, 4.7277f, 4.1677f, 5.0071f, 3.9571f, 5.2512f)
                curveTo(3.775f, 5.4622f, 3.7493f, 5.5741f, 3.75f, 5.6856f)
                curveTo(3.7506f, 5.7767f, 3.7743f, 5.8979f, 4.0015f, 6.1471f)
                curveTo(4.2496f, 6.4194f, 4.6384f, 6.7358f, 5.2485f, 7.2282f)
                lineTo(5.4558f, 7.3955f)
                curveTo(5.4877f, 7.4213f, 5.5194f, 7.4468f, 5.5509f, 7.4721f)
                curveTo(6.0081f, 7.8398f, 6.4118f, 8.1645f, 6.6341f, 8.6196f)
                curveTo(6.8594f, 9.0808f, 6.8584f, 9.5931f, 6.8574f, 10.1594f)
                curveTo(6.8573f, 10.1984f, 6.8572f, 10.2376f, 6.8572f, 10.2771f)
                verticalLineTo(15.5403f)
                curveTo(6.8572f, 16.2949f, 6.8681f, 16.4856f, 6.9308f, 16.6541f)
                curveTo(6.9949f, 16.826f, 7.1177f, 16.9868f, 7.6179f, 17.5755f)
                lineTo(9.9994f, 20.3785f)
                curveTo(10.5176f, 20.9885f, 10.637f, 21.1034f, 10.7783f, 21.1674f)
                curveTo(10.9262f, 21.2343f, 11.1097f, 21.25f, 11.9377f, 21.25f)
                horizontalLineTo(12.0623f)
                curveTo(12.8903f, 21.25f, 13.0738f, 21.2343f, 13.2217f, 21.1674f)
                curveTo(13.363f, 21.1034f, 13.4824f, 20.9885f, 14.0006f, 20.3785f)
                lineTo(16.3821f, 17.5755f)
                curveTo(16.8823f, 16.9868f, 17.0051f, 16.826f, 17.0692f, 16.6541f)
                curveTo(17.1319f, 16.4856f, 17.1428f, 16.2949f, 17.1428f, 15.5403f)
                verticalLineTo(10.2771f)
                curveTo(17.1428f, 10.2376f, 17.1427f, 10.1984f, 17.1426f, 10.1594f)
                curveTo(17.1416f, 9.5931f, 17.1406f, 9.0808f, 17.3659f, 8.6196f)
                curveTo(17.5882f, 8.1645f, 17.9919f, 7.8398f, 18.4491f, 7.4721f)
                curveTo(18.4806f, 7.4468f, 18.5123f, 7.4213f, 18.5442f, 7.3955f)
                lineTo(18.7515f, 7.2282f)
                curveTo(19.3616f, 6.7358f, 19.7504f, 6.4194f, 19.9986f, 6.1471f)
                curveTo(20.2257f, 5.8979f, 20.2494f, 5.7767f, 20.25f, 5.6856f)
                curveTo(20.2507f, 5.5741f, 20.225f, 5.4622f, 20.0429f, 5.2512f)
                curveTo(19.8323f, 5.0071f, 19.4983f, 4.7277f, 18.9539f, 4.2773f)
                curveTo(18.8051f, 4.1543f, 18.6618f, 4.0425f, 18.527f, 3.9459f)
                curveTo(18.0022f, 3.5694f, 17.2148f, 3.1375f, 16.633f, 2.8363f)
                curveTo(16.4176f, 2.7248f, 16.1434f, 2.7191f, 15.9034f, 2.8321f)
                lineTo(15.7108f, 2.9228f)
                curveTo(13.909f, 5.3683f, 10.091f, 5.3683f, 8.2892f, 2.9228f)
                lineTo(8.0966f, 2.8321f)
                close()
            }
        }
            .build()
        return _body!!
    }

private var _body: ImageVector? = null

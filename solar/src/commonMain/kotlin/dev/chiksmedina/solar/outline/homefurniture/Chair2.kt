package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Chair2: ImageVector
    get() {
        if (_chair2 != null) {
            return _chair2!!
        }
        _chair2 = Builder(
            name = "Chair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9595f, 1.25f)
                horizontalLineTo(12.0405f)
                curveTo(13.019f, 1.25f, 13.811f, 1.25f, 14.45f, 1.3159f)
                curveTo(15.1122f, 1.3843f, 15.6872f, 1.5293f, 16.2032f, 1.8696f)
                curveTo(16.5013f, 2.0662f, 16.7698f, 2.3044f, 17.0006f, 2.577f)
                curveTo(17.4f, 3.0488f, 17.6124f, 3.6024f, 17.7592f, 4.2518f)
                curveTo(17.9008f, 4.8784f, 17.9952f, 5.6647f, 18.1117f, 6.6362f)
                lineTo(18.2141f, 7.4892f)
                curveTo(18.3337f, 8.4859f, 18.4329f, 9.3121f, 18.4199f, 9.9707f)
                curveTo(18.4062f, 10.6629f, 18.2689f, 11.2996f, 17.8028f, 11.825f)
                curveTo(17.3366f, 12.3505f, 16.7208f, 12.5626f, 16.0352f, 12.6587f)
                curveTo(15.3828f, 12.7501f, 14.5507f, 12.75f, 13.5469f, 12.75f)
                lineTo(12.75f, 12.75f)
                verticalLineTo(13.75f)
                horizontalLineTo(17.0f)
                curveTo(17.321f, 13.75f, 17.6217f, 13.8364f, 17.8804f, 13.9872f)
                lineTo(18.1593f, 13.1503f)
                curveTo(18.228f, 12.9441f, 18.2765f, 12.7986f, 18.3653f, 12.6071f)
                curveTo(18.4512f, 12.4218f, 18.4949f, 12.3485f, 18.5634f, 12.2359f)
                curveTo(18.8483f, 11.7674f, 19.2195f, 11.3604f, 19.8209f, 11.0952f)
                curveTo(20.3873f, 10.8454f, 21.0949f, 10.75f, 22.0f, 10.75f)
                curveTo(22.4142f, 10.75f, 22.75f, 11.0858f, 22.75f, 11.5f)
                curveTo(22.75f, 11.9142f, 22.4142f, 12.25f, 22.0f, 12.25f)
                curveTo(21.1726f, 12.25f, 20.7105f, 12.3422f, 20.4262f, 12.4676f)
                curveTo(20.177f, 12.5776f, 20.0165f, 12.7334f, 19.845f, 13.0153f)
                curveTo(19.8146f, 13.0653f, 19.802f, 13.0863f, 19.7885f, 13.111f)
                curveTo(19.7755f, 13.135f, 19.7579f, 13.1695f, 19.7262f, 13.2379f)
                curveTo(19.6755f, 13.3472f, 19.6511f, 13.4184f, 19.5767f, 13.6417f)
                lineTo(18.7115f, 16.2372f)
                curveTo(18.6791f, 16.3345f, 18.6286f, 16.4207f, 18.5651f, 16.4934f)
                curveTo(18.1668f, 17.5212f, 17.1685f, 18.25f, 16.0f, 18.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.416f)
                curveTo(13.9066f, 19.741f, 14.8302f, 20.6188f, 15.2115f, 21.7628f)
                curveTo(15.3425f, 22.1558f, 15.1301f, 22.5805f, 14.7372f, 22.7115f)
                curveTo(14.3442f, 22.8425f, 13.9195f, 22.6301f, 13.7885f, 22.2372f)
                curveTo(13.6115f, 21.7061f, 13.2354f, 21.2729f, 12.75f, 21.0206f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(21.0206f)
                curveTo(10.7646f, 21.2729f, 10.3885f, 21.7061f, 10.2115f, 22.2372f)
                curveTo(10.0805f, 22.6301f, 9.6558f, 22.8425f, 9.2628f, 22.7115f)
                curveTo(8.8699f, 22.5805f, 8.6575f, 22.1558f, 8.7885f, 21.7628f)
                curveTo(9.1698f, 20.6188f, 10.0934f, 19.741f, 11.25f, 19.416f)
                verticalLineTo(18.25f)
                horizontalLineTo(8.0f)
                curveTo(6.8315f, 18.25f, 5.8332f, 17.5212f, 5.4349f, 16.4934f)
                curveTo(5.3714f, 16.4207f, 5.3209f, 16.3345f, 5.2885f, 16.2372f)
                lineTo(4.4233f, 13.6417f)
                curveTo(4.3489f, 13.4184f, 4.3245f, 13.3472f, 4.2738f, 13.2379f)
                curveTo(4.2421f, 13.1695f, 4.2245f, 13.135f, 4.2115f, 13.111f)
                curveTo(4.198f, 13.0863f, 4.1854f, 13.0653f, 4.155f, 13.0153f)
                curveTo(3.9835f, 12.7334f, 3.8231f, 12.5776f, 3.5738f, 12.4676f)
                curveTo(3.2895f, 12.3422f, 2.8274f, 12.25f, 2.0f, 12.25f)
                curveTo(1.5858f, 12.25f, 1.25f, 11.9142f, 1.25f, 11.5f)
                curveTo(1.25f, 11.0858f, 1.5858f, 10.75f, 2.0f, 10.75f)
                curveTo(2.9051f, 10.75f, 3.6127f, 10.8454f, 4.1791f, 11.0952f)
                curveTo(4.7805f, 11.3604f, 5.1517f, 11.7674f, 5.4366f, 12.2359f)
                curveTo(5.5051f, 12.3485f, 5.5488f, 12.4218f, 5.6347f, 12.6071f)
                curveTo(5.7235f, 12.7986f, 5.772f, 12.9441f, 5.8407f, 13.1504f)
                lineTo(6.1196f, 13.9872f)
                curveTo(6.3783f, 13.8364f, 6.679f, 13.75f, 7.0f, 13.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                lineTo(10.4531f, 12.75f)
                curveTo(9.4493f, 12.75f, 8.6172f, 12.7501f, 7.9648f, 12.6587f)
                curveTo(7.2792f, 12.5626f, 6.6634f, 12.3505f, 6.1972f, 11.825f)
                curveTo(5.7311f, 11.2996f, 5.5938f, 10.6629f, 5.5801f, 9.9707f)
                curveTo(5.5671f, 9.3121f, 5.6663f, 8.4859f, 5.7859f, 7.4893f)
                lineTo(5.8883f, 6.6363f)
                curveTo(6.0048f, 5.6647f, 6.0992f, 4.8784f, 6.2408f, 4.2518f)
                curveTo(6.3875f, 3.6024f, 6.6f, 3.0488f, 6.9994f, 2.577f)
                curveTo(7.2302f, 2.3044f, 7.4987f, 2.0662f, 7.7968f, 1.8696f)
                curveTo(8.3128f, 1.5293f, 8.8878f, 1.3843f, 9.55f, 1.3159f)
                curveTo(10.189f, 1.25f, 10.981f, 1.25f, 11.9595f, 1.25f)
                close()
                moveTo(16.0f, 16.75f)
                curveTo(16.6904f, 16.75f, 17.25f, 16.1904f, 17.25f, 15.5f)
                curveTo(17.25f, 15.3619f, 17.1381f, 15.25f, 17.0f, 15.25f)
                horizontalLineTo(7.0f)
                curveTo(6.8619f, 15.25f, 6.75f, 15.3619f, 6.75f, 15.5f)
                curveTo(6.75f, 16.1904f, 7.3096f, 16.75f, 8.0f, 16.75f)
                horizontalLineTo(16.0f)
                close()
                moveTo(9.704f, 2.808f)
                curveTo(9.1654f, 2.8636f, 8.8582f, 2.9664f, 8.6227f, 3.1218f)
                curveTo(8.4438f, 3.2397f, 8.2827f, 3.3827f, 8.1443f, 3.5462f)
                curveTo(7.962f, 3.7615f, 7.8232f, 4.0543f, 7.7039f, 4.5824f)
                curveTo(7.5813f, 5.1247f, 7.4953f, 5.8339f, 7.3728f, 6.8552f)
                lineTo(7.2818f, 7.6128f)
                curveTo(7.1539f, 8.6788f, 7.0691f, 9.3999f, 7.0798f, 9.9411f)
                curveTo(7.0901f, 10.4608f, 7.1886f, 10.6823f, 7.3193f, 10.8296f)
                curveTo(7.45f, 10.9768f, 7.6581f, 11.101f, 8.1729f, 11.1732f)
                curveTo(8.7089f, 11.2483f, 9.435f, 11.25f, 10.5087f, 11.25f)
                horizontalLineTo(13.4913f)
                curveTo(14.565f, 11.25f, 15.2911f, 11.2483f, 15.8271f, 11.1732f)
                curveTo(16.3419f, 11.101f, 16.55f, 10.9768f, 16.6807f, 10.8296f)
                curveTo(16.8114f, 10.6823f, 16.9099f, 10.4608f, 16.9202f, 9.9411f)
                curveTo(16.9309f, 9.3999f, 16.8461f, 8.6788f, 16.7182f, 7.6128f)
                lineTo(16.6272f, 6.8552f)
                curveTo(16.5047f, 5.8339f, 16.4186f, 5.1247f, 16.2961f, 4.5824f)
                curveTo(16.1767f, 4.0543f, 16.038f, 3.7615f, 15.8557f, 3.5462f)
                curveTo(15.7173f, 3.3827f, 15.5562f, 3.2397f, 15.3773f, 3.1218f)
                curveTo(15.1418f, 2.9664f, 14.8346f, 2.8636f, 14.296f, 2.808f)
                curveTo(13.743f, 2.7509f, 13.0286f, 2.75f, 12.0f, 2.75f)
                curveTo(10.9714f, 2.75f, 10.257f, 2.7509f, 9.704f, 2.808f)
                close()
            }
        }
            .build()
        return _chair2!!
    }

private var _chair2: ImageVector? = null

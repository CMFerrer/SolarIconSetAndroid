package dev.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

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
                pathFillType = NonZero
            ) {
                moveTo(7.572f, 3.0616f)
                curveTo(6.9903f, 3.7487f, 6.8696f, 4.7544f, 6.6283f, 6.7658f)
                lineTo(6.5373f, 7.5234f)
                curveTo(6.2868f, 9.6109f, 6.1616f, 10.6546f, 6.7584f, 11.3273f)
                curveTo(7.3552f, 12.0f, 8.4064f, 12.0f, 10.5088f, 12.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.75f)
                horizontalLineTo(7.0f)
                curveTo(6.679f, 13.75f, 6.3783f, 13.8364f, 6.1196f, 13.9872f)
                lineTo(5.8407f, 13.1504f)
                curveTo(5.772f, 12.9441f, 5.7235f, 12.7986f, 5.6347f, 12.6071f)
                curveTo(5.5488f, 12.4218f, 5.5051f, 12.3485f, 5.4366f, 12.2359f)
                curveTo(5.1517f, 11.7674f, 4.7805f, 11.3604f, 4.1791f, 11.0952f)
                curveTo(3.6127f, 10.8454f, 2.9051f, 10.75f, 2.0f, 10.75f)
                curveTo(1.5858f, 10.75f, 1.25f, 11.0858f, 1.25f, 11.5f)
                curveTo(1.25f, 11.9142f, 1.5858f, 12.25f, 2.0f, 12.25f)
                curveTo(2.8274f, 12.25f, 3.2895f, 12.3422f, 3.5738f, 12.4676f)
                curveTo(3.8231f, 12.5776f, 3.9835f, 12.7334f, 4.155f, 13.0153f)
                curveTo(4.1854f, 13.0653f, 4.198f, 13.0863f, 4.2115f, 13.111f)
                curveTo(4.2245f, 13.135f, 4.2421f, 13.1695f, 4.2738f, 13.2379f)
                curveTo(4.3245f, 13.3472f, 4.3489f, 13.4184f, 4.4233f, 13.6417f)
                lineTo(5.2885f, 16.2372f)
                curveTo(5.3209f, 16.3345f, 5.3714f, 16.4207f, 5.4349f, 16.4934f)
                curveTo(5.8332f, 17.5212f, 6.8315f, 18.25f, 8.0f, 18.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.416f)
                curveTo(10.0934f, 19.741f, 9.1698f, 20.6188f, 8.7885f, 21.7628f)
                curveTo(8.6575f, 22.1558f, 8.8699f, 22.5805f, 9.2628f, 22.7115f)
                curveTo(9.6558f, 22.8425f, 10.0805f, 22.6301f, 10.2115f, 22.2372f)
                curveTo(10.3885f, 21.7061f, 10.7646f, 21.2729f, 11.25f, 21.0206f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(21.0206f)
                curveTo(13.2354f, 21.2729f, 13.6115f, 21.7061f, 13.7885f, 22.2372f)
                curveTo(13.9195f, 22.6301f, 14.3442f, 22.8425f, 14.7372f, 22.7115f)
                curveTo(15.1301f, 22.5805f, 15.3425f, 22.1558f, 15.2115f, 21.7628f)
                curveTo(14.8302f, 20.6188f, 13.9066f, 19.741f, 12.75f, 19.416f)
                verticalLineTo(18.25f)
                horizontalLineTo(16.0f)
                curveTo(17.1685f, 18.25f, 18.1668f, 17.5212f, 18.5651f, 16.4934f)
                curveTo(18.6286f, 16.4207f, 18.6791f, 16.3345f, 18.7115f, 16.2372f)
                lineTo(19.5767f, 13.6417f)
                curveTo(19.6511f, 13.4184f, 19.6755f, 13.3472f, 19.7262f, 13.2379f)
                curveTo(19.7579f, 13.1695f, 19.7755f, 13.135f, 19.7885f, 13.111f)
                curveTo(19.802f, 13.0863f, 19.8146f, 13.0653f, 19.845f, 13.0153f)
                curveTo(20.0165f, 12.7334f, 20.177f, 12.5776f, 20.4262f, 12.4676f)
                curveTo(20.7105f, 12.3422f, 21.1726f, 12.25f, 22.0f, 12.25f)
                curveTo(22.4142f, 12.25f, 22.75f, 11.9142f, 22.75f, 11.5f)
                curveTo(22.75f, 11.0858f, 22.4142f, 10.75f, 22.0f, 10.75f)
                curveTo(21.0949f, 10.75f, 20.3873f, 10.8454f, 19.8209f, 11.0952f)
                curveTo(19.2195f, 11.3604f, 18.8483f, 11.7674f, 18.5634f, 12.2359f)
                curveTo(18.4949f, 12.3485f, 18.4512f, 12.4218f, 18.3653f, 12.6071f)
                curveTo(18.2765f, 12.7986f, 18.228f, 12.9441f, 18.1593f, 13.1504f)
                lineTo(17.8804f, 13.9872f)
                curveTo(17.6217f, 13.8364f, 17.321f, 13.75f, 17.0f, 13.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.4914f)
                curveTo(15.5939f, 12.0f, 16.6451f, 12.0f, 17.2419f, 11.3273f)
                curveTo(17.8387f, 10.6546f, 17.7134f, 9.6109f, 17.463f, 7.5234f)
                lineTo(17.372f, 6.7658f)
                curveTo(17.1307f, 4.7544f, 17.01f, 3.7487f, 16.4283f, 3.0616f)
                curveTo(16.2437f, 2.8435f, 16.0289f, 2.653f, 15.7904f, 2.4957f)
                curveTo(15.0389f, 2.0f, 14.026f, 2.0f, 12.0001f, 2.0f)
                curveTo(9.9743f, 2.0f, 8.9614f, 2.0f, 8.2099f, 2.4957f)
                curveTo(7.9714f, 2.653f, 7.7566f, 2.8435f, 7.572f, 3.0616f)
                close()
            }
        }
            .build()
        return _chair2!!
    }

private var _chair2: ImageVector? = null

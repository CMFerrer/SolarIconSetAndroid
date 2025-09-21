package dev.chiksmedina.solar.outline.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.LikeGroup

val LikeGroup.MedalRibbon: ImageVector
    get() {
        if (_medalRibbon != null) {
            return _medalRibbon!!
        }
        _medalRibbon = Builder(
            name = "MedalRibbon", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(8.5482f, 2.75f, 5.75f, 5.5482f, 5.75f, 9.0f)
                curveTo(5.75f, 12.4518f, 8.5482f, 15.25f, 12.0f, 15.25f)
                curveTo(15.4518f, 15.25f, 18.25f, 12.4518f, 18.25f, 9.0f)
                curveTo(18.25f, 5.5482f, 15.4518f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(4.25f, 9.0f)
                curveTo(4.25f, 4.7198f, 7.7198f, 1.25f, 12.0f, 1.25f)
                curveTo(16.2802f, 1.25f, 19.75f, 4.7198f, 19.75f, 9.0f)
                curveTo(19.75f, 11.2254f, 18.812f, 13.2317f, 17.3098f, 14.6452f)
                curveTo(17.3359f, 14.6939f, 17.357f, 14.7462f, 17.3722f, 14.8017f)
                lineTo(18.0217f, 17.1709f)
                curveTo(18.3252f, 18.2776f, 18.5696f, 19.169f, 18.6807f, 19.8607f)
                curveTo(18.7897f, 20.5387f, 18.812f, 21.2371f, 18.4326f, 21.8048f)
                curveTo(18.2166f, 22.128f, 17.9233f, 22.3927f, 17.5766f, 22.5692f)
                curveTo(16.9468f, 22.8899f, 16.2599f, 22.7318f, 15.6446f, 22.4995f)
                curveTo(15.017f, 22.2625f, 14.2288f, 21.8518f, 13.2607f, 21.3474f)
                lineTo(13.2141f, 21.3231f)
                curveTo(12.4899f, 20.9457f, 12.3008f, 20.861f, 12.1191f, 20.8417f)
                curveTo(12.0399f, 20.8332f, 11.9601f, 20.8332f, 11.8809f, 20.8417f)
                curveTo(11.6992f, 20.861f, 11.5101f, 20.9457f, 10.7859f, 21.3231f)
                lineTo(10.7393f, 21.3474f)
                curveTo(9.7712f, 21.8518f, 8.983f, 22.2625f, 8.3554f, 22.4995f)
                curveTo(7.7401f, 22.7318f, 7.0532f, 22.8899f, 6.4234f, 22.5692f)
                curveTo(6.0767f, 22.3927f, 5.7834f, 22.128f, 5.5674f, 21.8048f)
                curveTo(5.188f, 21.2371f, 5.2103f, 20.5387f, 5.3193f, 19.8607f)
                curveTo(5.4304f, 19.169f, 5.6748f, 18.2776f, 5.9783f, 17.1709f)
                lineTo(6.6278f, 14.8017f)
                curveTo(6.643f, 14.7462f, 6.6641f, 14.6939f, 6.6901f, 14.6452f)
                curveTo(5.188f, 13.2317f, 4.25f, 11.2254f, 4.25f, 9.0f)
                close()
                moveTo(7.9602f, 15.6151f)
                lineTo(7.4376f, 17.5213f)
                curveTo(7.1185f, 18.685f, 6.8969f, 19.4973f, 6.8003f, 20.0987f)
                curveTo(6.6999f, 20.7235f, 6.7747f, 20.9117f, 6.8145f, 20.9713f)
                curveTo(6.8924f, 21.0878f, 6.9933f, 21.1761f, 7.104f, 21.2325f)
                curveTo(7.1269f, 21.2441f, 7.2702f, 21.3058f, 7.8256f, 21.0961f)
                curveTo(8.3588f, 20.8949f, 9.0668f, 20.5274f, 10.0928f, 19.9928f)
                curveTo(10.1276f, 19.9747f, 10.1621f, 19.9567f, 10.1962f, 19.9389f)
                curveTo(10.7642f, 19.6421f, 11.2211f, 19.4035f, 11.722f, 19.3501f)
                curveTo(11.9068f, 19.3304f, 12.0932f, 19.3304f, 12.278f, 19.3501f)
                curveTo(12.7789f, 19.4035f, 13.2358f, 19.6421f, 13.8038f, 19.9389f)
                curveTo(13.8379f, 19.9567f, 13.8724f, 19.9747f, 13.9072f, 19.9928f)
                curveTo(14.9332f, 20.5274f, 15.6412f, 20.8949f, 16.1744f, 21.0961f)
                curveTo(16.7299f, 21.3058f, 16.8731f, 21.2441f, 16.896f, 21.2325f)
                curveTo(17.0067f, 21.1761f, 17.1076f, 21.0878f, 17.1855f, 20.9713f)
                curveTo(17.2253f, 20.9117f, 17.3002f, 20.7235f, 17.1997f, 20.0987f)
                curveTo(17.1031f, 19.4973f, 16.8815f, 18.685f, 16.5625f, 17.5213f)
                lineTo(16.0398f, 15.6151f)
                curveTo(14.8635f, 16.335f, 13.4802f, 16.75f, 12.0f, 16.75f)
                curveTo(10.5198f, 16.75f, 9.1365f, 16.335f, 7.9602f, 15.6151f)
                close()
            }
        }
            .build()
        return _medalRibbon!!
    }

private var _medalRibbon: ImageVector? = null

package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.7501f, 6.4064f)
                curveTo(10.2698f, 6.4064f, 10.1222f, 6.5625f, 9.3561f, 6.5625f)
                curveTo(8.7177f, 6.5625f, 6.8025f, 5.0f, 5.8449f, 5.0f)
                curveTo(4.8872f, 5.0f, 3.77f, 5.5625f, 3.77f, 7.1875f)
                verticalLineTo(9.0625f)
                curveTo(3.772f, 9.5547f, 3.9508f, 11.0634f, 4.6508f, 10.6602f)
                curveTo(3.8232f, 11.6382f, 3.7396f, 12.7786f, 3.751f, 13.8826f)
                curveTo(3.5281f, 13.947f, 3.3007f, 14.0196f, 3.08f, 14.095f)
                curveTo(2.3961f, 14.3289f, 1.6709f, 14.6271f, 1.3432f, 14.8387f)
                curveTo(0.9952f, 15.0634f, 0.8953f, 15.5277f, 1.1201f, 15.8756f)
                curveTo(1.3448f, 16.2236f, 1.809f, 16.3235f, 2.157f, 16.0988f)
                curveTo(2.3132f, 15.9979f, 2.8782f, 15.7493f, 3.5653f, 15.5144f)
                curveTo(3.6412f, 15.4884f, 3.7173f, 15.4631f, 3.793f, 15.4386f)
                curveTo(3.8393f, 15.8724f, 3.9541f, 16.2684f, 4.1248f, 16.6292f)
                lineTo(4.1012f, 16.6416f)
                curveTo(3.6915f, 16.8581f, 3.3113f, 17.1067f, 3.0689f, 17.2652f)
                curveTo(3.0269f, 17.2926f, 2.9891f, 17.3173f, 2.956f, 17.3387f)
                curveTo(2.608f, 17.5634f, 2.5081f, 18.0277f, 2.7329f, 18.3756f)
                curveTo(2.9576f, 18.7236f, 3.4218f, 18.8235f, 3.7698f, 18.5988f)
                curveTo(3.8109f, 18.5722f, 3.8547f, 18.5436f, 3.901f, 18.5134f)
                curveTo(4.1463f, 18.3533f, 4.46f, 18.1485f, 4.802f, 17.9678f)
                curveTo(4.8822f, 17.9254f, 4.9594f, 17.887f, 5.0332f, 17.8524f)
                curveTo(6.7635f, 19.4748f, 9.8699f, 20.0f, 11.7501f, 20.0f)
                curveTo(13.6302f, 20.0f, 16.7367f, 19.4748f, 18.467f, 17.8524f)
                curveTo(18.5408f, 17.887f, 18.6179f, 17.9254f, 18.6981f, 17.9678f)
                curveTo(19.0401f, 18.1485f, 19.3538f, 18.3533f, 19.5991f, 18.5134f)
                curveTo(19.6454f, 18.5436f, 19.6892f, 18.5722f, 19.7303f, 18.5988f)
                curveTo(20.0783f, 18.8235f, 20.5425f, 18.7236f, 20.7673f, 18.3756f)
                curveTo(20.992f, 18.0277f, 20.8921f, 17.5634f, 20.5441f, 17.3387f)
                curveTo(20.511f, 17.3173f, 20.4732f, 17.2926f, 20.4312f, 17.2652f)
                curveTo(20.1888f, 17.1067f, 19.8086f, 16.8581f, 19.3989f, 16.6416f)
                lineTo(19.3754f, 16.6292f)
                curveTo(19.5461f, 16.2683f, 19.6609f, 15.8724f, 19.7072f, 15.4385f)
                curveTo(19.783f, 15.463f, 19.8592f, 15.4884f, 19.9352f, 15.5144f)
                curveTo(20.6223f, 15.7493f, 21.1874f, 15.9979f, 21.3436f, 16.0988f)
                curveTo(21.6915f, 16.3235f, 22.1558f, 16.2236f, 22.3805f, 15.8756f)
                curveTo(22.6052f, 15.5277f, 22.5053f, 15.0634f, 22.1574f, 14.8387f)
                curveTo(21.8297f, 14.6271f, 21.1044f, 14.3289f, 20.4205f, 14.095f)
                curveTo(20.1997f, 14.0195f, 19.9722f, 13.947f, 19.7492f, 13.8825f)
                curveTo(19.7605f, 12.7785f, 19.6769f, 11.6382f, 18.8494f, 10.6602f)
                curveTo(19.5494f, 11.0634f, 19.7282f, 9.5547f, 19.7302f, 9.0625f)
                verticalLineTo(7.1876f)
                curveTo(19.7302f, 5.5626f, 18.613f, 5.0001f, 17.6553f, 5.0001f)
                curveTo(16.6977f, 5.0001f, 14.7825f, 6.5625f, 14.1441f, 6.5625f)
                curveTo(13.378f, 6.5625f, 13.2305f, 6.4064f, 11.7501f, 6.4064f)
                close()
                moveTo(11.0745f, 15.6004f)
                curveTo(11.2771f, 15.5314f, 11.5162f, 15.5f, 11.7501f, 15.5f)
                curveTo(11.984f, 15.5f, 12.223f, 15.5314f, 12.4257f, 15.6004f)
                curveTo(12.5251f, 15.6342f, 12.6467f, 15.6876f, 12.7537f, 15.7738f)
                curveTo(12.8612f, 15.8603f, 13.0001f, 16.0206f, 13.0001f, 16.25f)
                curveTo(13.0001f, 16.4794f, 12.8612f, 16.6397f, 12.7537f, 16.7262f)
                curveTo(12.6467f, 16.8124f, 12.5251f, 16.8658f, 12.4257f, 16.8996f)
                curveTo(12.223f, 16.9686f, 11.984f, 17.0f, 11.7501f, 17.0f)
                curveTo(11.5162f, 17.0f, 11.2771f, 16.9686f, 11.0745f, 16.8996f)
                curveTo(10.9751f, 16.8658f, 10.8535f, 16.8124f, 10.7464f, 16.7262f)
                curveTo(10.6389f, 16.6397f, 10.5001f, 16.4794f, 10.5001f, 16.25f)
                curveTo(10.5001f, 16.0206f, 10.6389f, 15.8603f, 10.7464f, 15.7738f)
                curveTo(10.8535f, 15.6876f, 10.9751f, 15.6342f, 11.0745f, 15.6004f)
                close()
                moveTo(13.9201f, 12.5005f)
                curveTo(14.0566f, 12.2721f, 14.326f, 12.0f, 14.7301f, 12.0f)
                curveTo(15.1342f, 12.0f, 15.4036f, 12.2721f, 15.54f, 12.5005f)
                curveTo(15.6823f, 12.7387f, 15.7501f, 13.0274f, 15.7501f, 13.3125f)
                curveTo(15.7501f, 13.5976f, 15.6823f, 13.8863f, 15.54f, 14.1245f)
                curveTo(15.4036f, 14.3529f, 15.1342f, 14.625f, 14.7301f, 14.625f)
                curveTo(14.326f, 14.625f, 14.0566f, 14.3529f, 13.9201f, 14.1245f)
                curveTo(13.7778f, 13.8863f, 13.7101f, 13.5976f, 13.7101f, 13.3125f)
                curveTo(13.7101f, 13.0274f, 13.7778f, 12.7387f, 13.9201f, 12.5005f)
                close()
                moveTo(7.9602f, 12.5005f)
                curveTo(8.0966f, 12.2721f, 8.366f, 12.0f, 8.7701f, 12.0f)
                curveTo(9.1742f, 12.0f, 9.4436f, 12.2721f, 9.58f, 12.5005f)
                curveTo(9.7223f, 12.7387f, 9.7901f, 13.0274f, 9.7901f, 13.3125f)
                curveTo(9.7901f, 13.5976f, 9.7223f, 13.8863f, 9.58f, 14.1245f)
                curveTo(9.4436f, 14.3529f, 9.1742f, 14.625f, 8.7701f, 14.625f)
                curveTo(8.366f, 14.625f, 8.0966f, 14.3529f, 7.9602f, 14.1245f)
                curveTo(7.8179f, 13.8863f, 7.7501f, 13.5976f, 7.7501f, 13.3125f)
                curveTo(7.7501f, 13.0274f, 7.8179f, 12.7387f, 7.9602f, 12.5005f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null

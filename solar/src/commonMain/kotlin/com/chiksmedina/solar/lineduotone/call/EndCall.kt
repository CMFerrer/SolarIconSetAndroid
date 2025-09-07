package com.chiksmedina.solar.lineduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.CallGroup

val CallGroup.EndCall: ImageVector
    get() {
        if (_endCall != null) {
            return _endCall!!
        }
        _endCall = Builder(
            name = "EndCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.8618f)
                lineTo(8.0f, 13.4784f)
                curveTo(8.0f, 14.3306f, 7.4233f, 15.0825f, 6.58f, 15.3296f)
                lineTo(4.58f, 15.9157f)
                curveTo(3.2956f, 16.2921f, 2.0f, 15.3625f, 2.0f, 14.0645f)
                lineTo(2.0f, 12.1416f)
                curveTo(2.0f, 11.6526f, 2.1247f, 11.1706f, 2.4408f, 10.789f)
                moveTo(21.3703f, 9.8561f)
                curveTo(21.8162f, 10.2543f, 22.0f, 10.8314f, 22.0f, 11.4184f)
                verticalLineTo(13.5431f)
                curveTo(22.0f, 14.7268f, 20.9105f, 15.633f, 19.7004f, 15.4557f)
                lineTo(17.7004f, 15.1626f)
                curveTo(16.7227f, 15.0193f, 16.0f, 14.2065f, 16.0f, 13.2501f)
                verticalLineTo(12.8618f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.2501f, 12.862f)
                curveTo(7.2501f, 13.2762f, 7.5859f, 13.612f, 8.0001f, 13.612f)
                curveTo(8.4143f, 13.612f, 8.7501f, 13.2762f, 8.7501f, 12.862f)
                horizontalLineTo(7.2501f)
                close()
                moveTo(12.0001f, 7.0002f)
                lineTo(12.0001f, 7.7502f)
                lineTo(12.0001f, 7.0002f)
                close()
                moveTo(15.2501f, 12.862f)
                curveTo(15.2501f, 13.2762f, 15.5859f, 13.612f, 16.0001f, 13.612f)
                curveTo(16.4143f, 13.612f, 16.7501f, 13.2762f, 16.7501f, 12.862f)
                lineTo(15.2501f, 12.862f)
                close()
                moveTo(12.0001f, 11.3965f)
                lineTo(12.0001f, 10.6465f)
                lineTo(12.0001f, 11.3965f)
                close()
                moveTo(3.0184f, 11.2677f)
                curveTo(3.9019f, 10.2014f, 6.5133f, 7.7502f, 12.0001f, 7.7502f)
                lineTo(12.0001f, 6.2502f)
                curveTo(5.9897f, 6.2502f, 2.9788f, 8.9644f, 1.8634f, 10.3106f)
                lineTo(3.0184f, 11.2677f)
                close()
                moveTo(12.0001f, 7.7502f)
                curveTo(17.2331f, 7.7502f, 19.8649f, 9.5173f, 20.8709f, 10.4157f)
                lineTo(21.87f, 9.2969f)
                curveTo(20.5945f, 8.1578f, 17.6088f, 6.2502f, 12.0001f, 6.2502f)
                lineTo(12.0001f, 7.7502f)
                close()
                moveTo(16.0001f, 12.862f)
                curveTo(16.7501f, 12.862f, 16.7501f, 12.861f, 16.7501f, 12.8599f)
                curveTo(16.7501f, 12.8596f, 16.7501f, 12.8586f, 16.7501f, 12.8579f)
                curveTo(16.7501f, 12.8565f, 16.7501f, 12.8551f, 16.75f, 12.8536f)
                curveTo(16.75f, 12.8507f, 16.75f, 12.8478f, 16.7499f, 12.8447f)
                curveTo(16.7498f, 12.8385f, 16.7496f, 12.8318f, 16.7492f, 12.8248f)
                curveTo(16.7486f, 12.8107f, 16.7476f, 12.7949f, 16.746f, 12.7775f)
                curveTo(16.7429f, 12.7429f, 16.7375f, 12.7018f, 16.7284f, 12.6555f)
                curveTo(16.7103f, 12.5625f, 16.6777f, 12.4487f, 16.6203f, 12.3224f)
                curveTo(16.5031f, 12.0648f, 16.2942f, 11.7813f, 15.9434f, 11.5243f)
                curveTo(15.2574f, 11.0217f, 14.0695f, 10.6465f, 12.0001f, 10.6465f)
                lineTo(12.0001f, 12.1465f)
                curveTo(13.9307f, 12.1465f, 14.7428f, 12.5041f, 15.0568f, 12.7342f)
                curveTo(15.206f, 12.8435f, 15.2471f, 12.9264f, 15.2549f, 12.9436f)
                curveTo(15.26f, 12.9547f, 15.2586f, 12.9554f, 15.2561f, 12.9425f)
                curveTo(15.2549f, 12.9362f, 15.2534f, 12.9267f, 15.2522f, 12.9135f)
                curveTo(15.2516f, 12.9068f, 15.2511f, 12.8993f, 15.2507f, 12.8907f)
                curveTo(15.2505f, 12.8865f, 15.2504f, 12.8819f, 15.2503f, 12.8771f)
                curveTo(15.2502f, 12.8747f, 15.2502f, 12.8723f, 15.2501f, 12.8698f)
                curveTo(15.2501f, 12.8685f, 15.2501f, 12.8672f, 15.2501f, 12.8659f)
                curveTo(15.2501f, 12.8653f, 15.2501f, 12.8643f, 15.2501f, 12.8639f)
                curveTo(15.2501f, 12.863f, 15.2501f, 12.862f, 16.0001f, 12.862f)
                close()
                moveTo(12.0001f, 10.6465f)
                curveTo(9.9306f, 10.6465f, 8.7428f, 11.0217f, 8.0568f, 11.5243f)
                curveTo(7.706f, 11.7813f, 7.4971f, 12.0648f, 7.3799f, 12.3224f)
                curveTo(7.3225f, 12.4487f, 7.2899f, 12.5625f, 7.2718f, 12.6555f)
                curveTo(7.2627f, 12.7018f, 7.2573f, 12.7429f, 7.2541f, 12.7775f)
                curveTo(7.2526f, 12.7949f, 7.2516f, 12.8107f, 7.2509f, 12.8248f)
                curveTo(7.2506f, 12.8318f, 7.2504f, 12.8385f, 7.2503f, 12.8447f)
                curveTo(7.2502f, 12.8478f, 7.2502f, 12.8507f, 7.2501f, 12.8536f)
                curveTo(7.2501f, 12.8551f, 7.2501f, 12.8565f, 7.2501f, 12.8579f)
                curveTo(7.2501f, 12.8586f, 7.2501f, 12.8596f, 7.2501f, 12.8599f)
                curveTo(7.2501f, 12.861f, 7.2501f, 12.862f, 8.0001f, 12.862f)
                curveTo(8.7501f, 12.862f, 8.7501f, 12.863f, 8.7501f, 12.8639f)
                curveTo(8.7501f, 12.8643f, 8.7501f, 12.8653f, 8.7501f, 12.8659f)
                curveTo(8.7501f, 12.8672f, 8.7501f, 12.8685f, 8.75f, 12.8698f)
                curveTo(8.75f, 12.8723f, 8.75f, 12.8747f, 8.7499f, 12.8771f)
                curveTo(8.7498f, 12.8819f, 8.7497f, 12.8865f, 8.7495f, 12.8907f)
                curveTo(8.7491f, 12.8993f, 8.7486f, 12.9068f, 8.748f, 12.9135f)
                curveTo(8.7468f, 12.9267f, 8.7453f, 12.9362f, 8.744f, 12.9425f)
                curveTo(8.7415f, 12.9554f, 8.7402f, 12.9547f, 8.7453f, 12.9436f)
                curveTo(8.7531f, 12.9264f, 8.7942f, 12.8435f, 8.9434f, 12.7342f)
                curveTo(9.2574f, 12.5041f, 10.0695f, 12.1465f, 12.0001f, 12.1465f)
                lineTo(12.0001f, 10.6465f)
                close()
            }
        }
            .build()
        return _endCall!!
    }

private var _endCall: ImageVector? = null
